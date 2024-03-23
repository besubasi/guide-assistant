package tr.com.subasi.guideassistant.app.touractivityrel.service;


import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.touractivityrel.converter.TourActivityRelConverter;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSaveModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;
import tr.com.subasi.guideassistant.app.touractivityrel.repository.TourActivityRelRepository;
import tr.com.subasi.guideassistant.app.touractivityrel.repository.TourActivityRelRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourActivityRelServiceImpl extends BaseServiceImpl2<TourActivityRelSaveModel, TourActivityRelModel, TourActivityRelSearchModel, TourActivityRelEntity, TourActivityRelRepository, TourActivityRelConverter> implements TourActivityRelService {
    public TourActivityRelServiceImpl(TourActivityRelRepositoryImpl repository, TourActivityRelConverter converter) {
        super(repository, converter);
    }


    @Override
    public List<TourActivityRelModel> getList(TourActivityRelSearchModel searchModel) {
        List<Tuple> resultList = repository.getList(searchModel);
        return this.convertToModel(resultList);
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