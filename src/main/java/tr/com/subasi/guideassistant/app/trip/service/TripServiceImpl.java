package tr.com.subasi.guideassistant.app.trip.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;
import tr.com.subasi.guideassistant.app.touractivityrel.repository.TourActivityRelRepository;
import tr.com.subasi.guideassistant.app.trip.converter.TripConverter;
import tr.com.subasi.guideassistant.app.trip.entity.TripEntity;
import tr.com.subasi.guideassistant.app.trip.model.*;
import tr.com.subasi.guideassistant.app.trip.repository.TripRepository;
import tr.com.subasi.guideassistant.app.tripactivity.entity.TripActivityEntity;
import tr.com.subasi.guideassistant.app.tripactivity.repository.TripActivityRepository;
import tr.com.subasi.guideassistant.app.tripcustomer.converter.TripCustomerConverter;
import tr.com.subasi.guideassistant.app.tripcustomer.entity.TripCustomerEntity;
import tr.com.subasi.guideassistant.app.tripcustomer.repository.TripCustomerRepository;
import tr.com.subasi.guideassistant.app.user.model.UserModel;
import tr.com.subasi.guideassistant.app.user.service.UserService;
import tr.com.subasi.guideassistant.common.enums.EnumRoleType;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.session.model.LoginResponse;
import tr.com.subasi.guideassistant.common.session.service.AuthenticationService;
import tr.com.subasi.guideassistant.common.util.SortUtil;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class TripServiceImpl implements TripService {

    private final TripRepository repository;
    private final TripConverter converter;
    private final TripCustomerRepository tripCustomerRepository;
    private final TripCustomerConverter tripCustomerConverter;
    private final TourActivityRelRepository tourActivityRelRepository;
    private final TripActivityRepository tripActivityRepository;
    private final UserService userService;
    private final AuthenticationService authenticationService;

    public TripServiceImpl(TripRepository repository,
                           TripConverter converter,
                           TripCustomerRepository tripCustomerRepository,
                           TripCustomerConverter tripCustomerConverter,
                           TourActivityRelRepository tourActivityRelRepository,
                           TripActivityRepository tripActivityRepository,
                           UserService userService,
                           AuthenticationService authenticationService) {
        this.repository = repository;
        this.converter = converter;
        this.tripCustomerRepository = tripCustomerRepository;
        this.tripCustomerConverter = tripCustomerConverter;
        this.tourActivityRelRepository = tourActivityRelRepository;
        this.tripActivityRepository = tripActivityRepository;
        this.userService = userService;
        this.authenticationService = authenticationService;
    }

    @Override
    public TripSaveResponse save(TripSaveModel model) {
        TripEntity tripEntity = this.repository.save(this.converter.convertToEntityBySaveModel(model));
        String activationCode = this.generateActivationCode();
        tripEntity.setActivationCode(activationCode);
        List<TripCustomerEntity> tripCustomerEntityList = tripCustomerConverter.convertToEntityListBySaveModel(model.getCustomerList());
        tripCustomerEntityList.forEach(x -> {
            x.setTripId(tripEntity.getId());
            x.setActivationCode(activationCode);
        });

        tripCustomerRepository.saveAll(tripCustomerEntityList);

        TourActivityRelSearchModel searchModel = new TourActivityRelSearchModel();
        searchModel.setTourId(model.getTourId());
        searchModel.setActive(Boolean.TRUE);

        List<Tuple> tupleList = tourActivityRelRepository.getList(searchModel);
        if (CollectionUtils.isNotEmpty(tupleList)) {
            List<TripActivityEntity> tripActivityList = new ArrayList<>();
            tupleList.forEach(tuple -> {
                TourActivityRelEntity tourActivityRelEntity = tuple.get(0, TourActivityRelEntity.class);
                TripActivityEntity tripActivityEntity = new TripActivityEntity();
                tripActivityEntity.setTripId(tripEntity.getId());
                tripActivityEntity.setActivityId(tourActivityRelEntity.getActivityId());
                tripActivityEntity.setLineNumber(tourActivityRelEntity.getLineNumber());
                tripActivityEntity.setDayNumber(tourActivityRelEntity.getDayNumber());
                tripActivityEntity.setEstimatedTime(tourActivityRelEntity.getActivity().getEstimatedTime());
                tripActivityEntity.setExtra(tourActivityRelEntity.isActive());
                tripActivityEntity.setActivityCompanyId(tourActivityRelEntity.getActivityCompanyId());
                tripActivityEntity.setActive(Boolean.TRUE);

                tripActivityList.add(tripActivityEntity);
            });

            tripActivityRepository.saveAll(tripActivityList);
        }

        return new TripSaveResponse(activationCode);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public TripModel getById(Long id) {
        return this.converter.convertToModel(repository.getReferenceById(id));
    }

    @Override
    public List<LookupModel> getLookupList(TripSearchModel searchModel) {
        return this.converter.convertToLookupModelList(repository.findAll());
    }

    @Override
    public List<TripModel> getList(TripSearchModel searchModel) {
        return this.converter.convertToModelList(repository.findAll());
    }

    @Override
    public Page<TripModel> getPage(TripSearchModel searchModel) {
        org.springframework.data.domain.Page<TripEntity> page = repository.findAll(SortUtil.convertToPageRequest(searchModel.getPageable()));
        return new Page<>(converter.convertToModelList(page.getContent()), page.getTotalElements(), page.getTotalPages(), searchModel.getPageable());
    }

    @Override
    public LoginResponse joinTrip(JoinTripRequest joinTripRequest) {
        String phoneNumber = joinTripRequest.getPhoneNumber();
        TripCustomerEntity tripCustomer = tripCustomerRepository.getByPhoneNumberAndActivationCode(phoneNumber, joinTripRequest.getActivationCode());
        if (tripCustomer == null)
            return null;

        UserModel user = userService.getByPhoneNumber(phoneNumber);
        if (user == null) {
            this.createUserByTripCustomer(tripCustomer);
        } else {
            this.setUserActiveTripInfo(tripCustomer, user);
        }

        return authenticationService.loginTraveler(phoneNumber);
    }

    @Override
    public TripCompletionModel getCompletionRate(Long id) {
        TripEntity trip = repository.getReferenceById(id);
        List<TripActivityEntity> tripActivityList = tripActivityRepository.getByTripId(id);

        long dayNumber = ChronoUnit.DAYS.between(trip.getStartDate(), LocalDate.now()) + 1;
        List<Long> completedActivityIdList = CollectionUtils.emptyIfNull(tripActivityList).stream().filter(x -> x.getDayNumber().longValue() < dayNumber).map(TripActivityEntity::getActivityId).toList();
        List<Long> continuedActivityIdList = CollectionUtils.emptyIfNull(tripActivityList).stream().filter(x -> x.getDayNumber().longValue() == dayNumber).map(TripActivityEntity::getActivityId).toList();
        List<Long> futureActivityIdList = CollectionUtils.emptyIfNull(tripActivityList).stream().filter(x -> x.getDayNumber().longValue() > dayNumber).map(TripActivityEntity::getActivityId).toList();

        TripCompletionModel tripCompletionModel = new TripCompletionModel();
        tripCompletionModel.setCompletedActivityCount(completedActivityIdList.size());
        tripCompletionModel.setContinuedActivityCount(continuedActivityIdList.size());
        tripCompletionModel.setFutureActivityCount(futureActivityIdList.size());
        tripCompletionModel.setCompletedActivityIdList(completedActivityIdList);
        tripCompletionModel.setContinuedActivityIdList(continuedActivityIdList);
        tripCompletionModel.setFutureActivityIdList(futureActivityIdList);
        int completionRate = (int) ((double) tripCompletionModel.getCompletedActivityCount() / tripActivityList.size() * 100);
        tripCompletionModel.setCompletionRate(completionRate);

        return tripCompletionModel;
    }

    private String generateActivationCode() {
        Random random = new Random();
        int min = 100000; // En küçük 6 basamaklı sayı
        int max = 999999; // En büyük 6 basamaklı sayı
        return String.valueOf(random.nextInt(max - min + 1) + min);
    }

    private void createUserByTripCustomer(TripCustomerEntity tripCustomer) {
        UserModel userModel = new UserModel();
        userModel.setName(tripCustomer.getName());
        userModel.setPassword(AuthenticationService.TRAVELER_ENTRY);
        userModel.setLanguageId(1L); // TODO
        userModel.setEmail(tripCustomer.getEmail());
        userModel.setActive(Boolean.TRUE);
        userModel.setActiveTripId(tripCustomer.getTripId());
        userModel.setRoleType(EnumRoleType.TRAVELER);
        userModel.setUsername(tripCustomer.getPhoneNumber());
        userModel.setPhoneNumber(tripCustomer.getPhoneNumber());
        if (tripCustomer.getRelationLineNumber() != null) {
            TripCustomerEntity referenceTripCustomer = tripCustomerRepository.getByTripIdAndLineNumber(tripCustomer.getTripId(), tripCustomer.getRelationLineNumber());
            if (referenceTripCustomer != null)
                userModel.setReferencePhoneNumber(referenceTripCustomer.getPhoneNumber());
        }

        userService.save(userModel);
    }

    private void setUserActiveTripInfo(TripCustomerEntity tripCustomer, UserModel user) {
        user.setActiveTripId(tripCustomer.getTripId());
        userService.save(user);
    }

}
