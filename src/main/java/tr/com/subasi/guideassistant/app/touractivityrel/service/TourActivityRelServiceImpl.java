package tr.com.subasi.guideassistant.app.touractivityrel.service;


import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activity.converter.ActivityConverter;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.activitygallery.converter.ActivityGalleryConverter;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.converter.TourActivityRelConverter;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.model.*;
import tr.com.subasi.guideassistant.app.touractivityrel.repository.TourActivityRelRepository;
import tr.com.subasi.guideassistant.app.touractivityrel.repository.TourActivityRelRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourActivityRelServiceImpl extends BaseServiceImpl2<TourActivityRelSaveModel, TourActivityRelModel, TourActivityRelSearchModel, TourActivityRelEntity, TourActivityRelRepository, TourActivityRelConverter> implements TourActivityRelService {

    private ActivityConverter activityConverter;
    private ActivityGalleryConverter activityGalleryConverter;

    public TourActivityRelServiceImpl(TourActivityRelRepositoryImpl repository, TourActivityRelConverter converter, ActivityConverter activityConverter, ActivityGalleryConverter activityGalleryConverter) {
        super(repository, converter);
        this.activityConverter = activityConverter;
        this.activityGalleryConverter = activityGalleryConverter;
    }


    @Override
    public List<TourActivityRelModel> getList(TourActivityRelSearchModel searchModel) {
        List<Tuple> resultList = repository.getList(searchModel);
        return this.convertToModel(resultList);
    }

    @Override
    public List<TourActivityDetailResponse> getDetail(TourActivityDetailRequest request) {
        List<ActivityEntity> activityEntityList = repository.getActivityList(request);
        List<ActivityGalleryEntity> activityGalleryList = repository.getActivityGalleryList(request);

        List<ActivityModel> activityModelList = activityConverter.convertToModelList(activityEntityList);
        //List<ActivityGalleryModel> activityGalleryModelList = activityGalleryConverter.convertToModelList(activityGalleryList);

        List<TourActivityDetailResponse> detailList = new ArrayList<>();
        CollectionUtils.emptyIfNull(activityModelList).forEach(activity -> {
            //List<ActivityGalleryModel> galleryList = CollectionUtils.emptyIfNull(activityGalleryModelList).stream().filter(x -> x.getActivityId().equals(activity.getId())).toList();
            TourActivityDetailResponse detail = new TourActivityDetailResponse();
            detail.setActivity(activity);
            //detail.setActivityGalleryList(galleryList);
            detailList.add(detail);
        });

        return detailList;
    }

    @Override
    public List<ActivityModel> getActivityList(TourActivityDetailRequest tourActivityDetailRequest) {
        return activityConverter.convertToModelList(repository.getActivityList(tourActivityDetailRequest));
    }

    private List<TourActivityRelModel> convertToModel(List<Tuple> tupleList) {
        List<TourActivityRelModel> list = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                list.add(this.convertToModel(tuple))
        );
        return list;
    }

    private TourActivityRelModel convertToModel(Tuple tuple) {
        TourActivityRelEntity entity = tuple.get(0, TourActivityRelEntity.class);
        TourActivityRelModel model = converter.convertToModel(entity);
        model.setTourCode(tuple.get("tourCode", String.class));
        model.setTourName(tuple.get("tourName", String.class));
        model.setActivityCode(tuple.get("activityCode", String.class));
        model.setActivityName(tuple.get("activityName", String.class));
        return model;
    }
}