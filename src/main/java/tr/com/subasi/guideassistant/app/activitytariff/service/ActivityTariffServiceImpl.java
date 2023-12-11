package tr.com.subasi.guideassistant.app.activitytariff.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitytariff.entity.ActivityTariffEntity;
import tr.com.subasi.guideassistant.app.activitytariff.mapper.ActivityTariffMapper;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffModel;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSearchModel;
import tr.com.subasi.guideassistant.app.activitytariff.repository.ActivityTariffRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class ActivityTariffServiceImpl extends GenericServiceImpl<ActivityTariffModel, ActivityTariffSearchModel, ActivityTariffEntity> implements tr.com.subasi.guideassistant.app.activitytariff.service.ActivityTariffService {
    public ActivityTariffServiceImpl(ActivityTariffRepository repository, ActivityTariffMapper mapper) {
        super(repository, mapper);
    }
}
