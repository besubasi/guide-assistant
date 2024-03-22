package tr.com.subasi.guideassistant.app.activitycompanyrel.service;


import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitycompanyrel.converter.ActivityCompanyRelConverter;
import tr.com.subasi.guideassistant.app.activitycompanyrel.entity.ActivityCompanyRelEntity;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSaveModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.repository.ActivityCompanyRelRepository;
import tr.com.subasi.guideassistant.app.activitycompanyrel.repository.ActivityCompanyRelRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ActivityCompanyRelServiceImpl extends BaseServiceImpl2<ActivityCompanyRelSaveModel, ActivityCompanyRelModel, ActivityCompanyRelSearchModel, ActivityCompanyRelEntity, ActivityCompanyRelRepository, ActivityCompanyRelConverter> implements ActivityCompanyRelService {
    public ActivityCompanyRelServiceImpl(ActivityCompanyRelRepositoryImpl repository, ActivityCompanyRelConverter converter) {
        super(repository, converter);
    }

    @Override
    public Boolean saveBatch(List<ActivityCompanyRelSaveModel> modelList) {
        Long activityId = modelList.get(0).getActivityId();
        List<ActivityCompanyRelEntity> currentRelList = repository.findByActivityId(activityId);
        if (CollectionUtils.isEmpty(currentRelList)) {
            repository.saveAll(converter.convertToEntityList(modelList));
        } else {
            Map<Long, ActivityCompanyRelEntity> relEntityMap = currentRelList.stream().collect(Collectors.toMap(ActivityCompanyRelEntity::getActivityCompanyId, x -> x));
            List<ActivityCompanyRelEntity> saveList = new ArrayList<>();
            modelList.forEach(model -> {
                ActivityCompanyRelEntity activityCompanyRelEntity = relEntityMap.get(model.getActivityCompanyId());
                if (activityCompanyRelEntity == null) {
                    saveList.add(converter.convertToEntity(model));
                } else if (!activityCompanyRelEntity.isActive()) {
                    activityCompanyRelEntity.setActive(Boolean.TRUE);
                    saveList.add(activityCompanyRelEntity);
                }
            });

            if (CollectionUtils.isNotEmpty(saveList))
                repository.saveAll(saveList);
        }

        return Boolean.TRUE;
    }

    @Override
    public List<ActivityCompanyRelModel> getList(ActivityCompanyRelSearchModel searchModel) {
        List<Tuple> resultList = repository.getList(searchModel);
        return this.convertToModel(resultList);
    }

    private List<ActivityCompanyRelModel> convertToModel(List<Tuple> tupleList) {
        List<ActivityCompanyRelModel> list = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                list.add(this.convertToModel(tuple))
        );
        return list;
    }

    private ActivityCompanyRelModel convertToModel(Tuple tuple) {
        ActivityCompanyRelEntity activityCompanyRelEntity = tuple.get(0, ActivityCompanyRelEntity.class);
        ActivityCompanyRelModel activityCompanyRelModel = converter.convertToModel(activityCompanyRelEntity);
        activityCompanyRelModel.setActivityCompanyName(tuple.get("activityCompanyName", String.class));
        return activityCompanyRelModel;
    }
}