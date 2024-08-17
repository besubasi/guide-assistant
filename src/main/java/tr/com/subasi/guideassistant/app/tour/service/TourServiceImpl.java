package tr.com.subasi.guideassistant.app.tour.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.tour.converter.TourConverter;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSaveModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepository;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepositoryImpl;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityDetailRequest;
import tr.com.subasi.guideassistant.app.touractivityrel.service.TourActivityRelService;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.util.SortUtil;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    private final TourRepository repository;
    private final TourConverter converter;
    private final TourActivityRelService tourActivityRelService;

    public TourServiceImpl(TourRepositoryImpl repository, TourConverter converter, TourActivityRelService tourActivityRelService) {
        this.repository = repository;
        this.converter = converter;
        this.tourActivityRelService = tourActivityRelService;
    }

    @Override
    public TourSaveModel save(TourSaveModel model) {
        return converter.convertToModel(this.repository.save(this.converter.convertToEntity(model)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public TourModel getById(Long id) {
        return this.converter.convertToModel(repository.getReferenceById(id));
    }

    @Override
    public List<TourModel> getList(TourSearchModel searchModel) {
        return this.convertToModel(repository.getList(searchModel));
    }

    @Override
    public Page<TourModel> getPage(TourSearchModel searchModel) {
        org.springframework.data.domain.Page<TourEntity> page = repository.findAll(SortUtil.convertToPageRequest(searchModel.getPageable()));
        return new Page<>(converter.convertToModelList(page.getContent()), page.getTotalElements(), page.getTotalPages(), searchModel.getPageable());
    }

    @Override
    public List<ActivityModel> getActivityList(TourActivityDetailRequest tourActivityDetailRequest) {
        return tourActivityRelService.getActivityList(tourActivityDetailRequest);
    }

    private List<TourModel> convertToModel(List<Tuple> tupleList) {
        List<TourModel> tourModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                tourModelList.add(this.convertToModel(tuple))
        );
        return tourModelList;
    }

    private TourModel convertToModel(Tuple tuple) {
        TourEntity tourEntity = tuple.get(0, TourEntity.class);
        TourModel tourModel = converter.convertToModel(tourEntity);
        tourModel.setCompanyCode(tuple.get("companyCode", String.class));
        tourModel.setCompanyName(tuple.get("companyName", String.class));
        tourModel.setTourTypeName(tuple.get("tourTypeName", String.class));
        tourModel.setTourCategoryName(tuple.get("tourCategoryName", String.class));
        return tourModel;
    }

}
