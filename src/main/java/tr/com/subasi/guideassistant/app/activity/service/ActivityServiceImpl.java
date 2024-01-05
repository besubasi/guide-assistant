package tr.com.subasi.guideassistant.app.activity.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activity.converter.ActivityConverter;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.activity.model.ActivitySearchModel;
import tr.com.subasi.guideassistant.app.activity.repository.ActivityRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class ActivityServiceImpl extends BaseServiceImpl<ActivityModel, ActivitySearchModel, ActivityEntity, ActivityRepository, ActivityConverter> implements ActivityService {
    public ActivityServiceImpl(ActivityRepository repository, ActivityConverter converter) {
        super(repository, converter);
    }
}
