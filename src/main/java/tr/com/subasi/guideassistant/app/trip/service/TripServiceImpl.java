package tr.com.subasi.guideassistant.app.trip.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;
import tr.com.subasi.guideassistant.app.touractivityrel.repository.TourActivityRelRepository;
import tr.com.subasi.guideassistant.app.trip.converter.TripConverter;
import tr.com.subasi.guideassistant.app.trip.entity.TripEntity;
import tr.com.subasi.guideassistant.app.trip.model.TripModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSaveModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSaveResponse;
import tr.com.subasi.guideassistant.app.trip.model.TripSearchModel;
import tr.com.subasi.guideassistant.app.trip.repository.TripRepository;
import tr.com.subasi.guideassistant.app.tripactivity.entity.TripActivityEntity;
import tr.com.subasi.guideassistant.app.tripactivity.repository.TripActivityRepository;
import tr.com.subasi.guideassistant.app.tripcustomer.converter.TripCustomerConverter;
import tr.com.subasi.guideassistant.app.tripcustomer.entity.TripCustomerEntity;
import tr.com.subasi.guideassistant.app.tripcustomer.repository.TripCustomerRepository;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.util.SortUtil;

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

    public TripServiceImpl(TripRepository repository,
                           TripConverter converter,
                           TripCustomerRepository tripCustomerRepository,
                           TripCustomerConverter tripCustomerConverter,
                           TourActivityRelRepository tourActivityRelRepository,
                           TripActivityRepository tripActivityRepository) {
        this.repository = repository;
        this.converter = converter;
        this.tripCustomerRepository = tripCustomerRepository;
        this.tripCustomerConverter = tripCustomerConverter;
        this.tourActivityRelRepository = tourActivityRelRepository;
        this.tripActivityRepository = tripActivityRepository;
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


    private String generateActivationCode() {
        Random random = new Random();
        int min = 100000; // En küçük 6 basamaklı sayı
        int max = 999999; // En büyük 6 basamaklı sayı
        return String.valueOf(random.nextInt(max - min + 1) + min);
    }

}
