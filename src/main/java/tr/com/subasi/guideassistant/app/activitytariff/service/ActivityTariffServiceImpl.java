package tr.com.subasi.guideassistant.app.activitytariff.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitytariff.converter.ActivityTariffConverter;
import tr.com.subasi.guideassistant.app.activitytariff.entity.ActivityTariffEntity;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffModel;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSaveModel;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSearchModel;
import tr.com.subasi.guideassistant.app.activitytariff.repository.ActivityTariffRepository;
import tr.com.subasi.guideassistant.app.activitytariff.repository.ActivityTariffRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

@Service
public class ActivityTariffServiceImpl extends BaseServiceImpl2<ActivityTariffSaveModel, ActivityTariffModel, ActivityTariffSearchModel, ActivityTariffEntity, ActivityTariffRepository, ActivityTariffConverter> implements ActivityTariffService {
    public ActivityTariffServiceImpl(ActivityTariffRepositoryImpl repository, ActivityTariffConverter converter) {
        super(repository, converter);
    }
}
