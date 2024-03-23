package tr.com.subasi.guideassistant.app.activitytariff.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitytariff.converter.ActivityTariffConverter;
import tr.com.subasi.guideassistant.app.activitytariff.entity.ActivityTariffEntity;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffModel;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSaveModel;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSearchModel;
import tr.com.subasi.guideassistant.app.activitytariff.repository.ActivityTariffRepository;
import tr.com.subasi.guideassistant.app.activitytariff.repository.ActivityTariffRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityTariffServiceImpl extends BaseServiceImpl2<ActivityTariffSaveModel, ActivityTariffModel, ActivityTariffSearchModel, ActivityTariffEntity, ActivityTariffRepository, ActivityTariffConverter> implements ActivityTariffService {
    public ActivityTariffServiceImpl(ActivityTariffRepositoryImpl repository, ActivityTariffConverter converter) {
        super(repository, converter);
    }

    @Override
    public List<ActivityTariffModel> getList(ActivityTariffSearchModel searchModel) {
        List<Tuple> tupleList = repository.getList(searchModel);
        return this.convertToModel(tupleList);
    }

    private List<ActivityTariffModel> convertToModel(List<Tuple> tupleList) {
        List<ActivityTariffModel> list = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                list.add(this.convertToModel(tuple))
        );
        return list;
    }

    private ActivityTariffModel convertToModel(Tuple tuple) {
        ActivityTariffEntity entity = tuple.get(0, ActivityTariffEntity.class);
        ActivityTariffModel model = converter.convertToModel(entity);
        model.setPricingTypeCode(tuple.get("pricingTypeCode", String.class));
        model.setPricingTypeName(tuple.get("pricingTypeName", String.class));
        model.setCurrencyCode(tuple.get("currencyCode", String.class));
        model.setCurrencyName(tuple.get("currencyName", String.class));
        return model;
    }

}
