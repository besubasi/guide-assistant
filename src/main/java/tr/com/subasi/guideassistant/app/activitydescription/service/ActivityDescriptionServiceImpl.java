package tr.com.subasi.guideassistant.app.activitydescription.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitydescription.converter.ActivityDescriptionConverter;
import tr.com.subasi.guideassistant.app.activitydescription.entity.ActivityDescriptionEntity;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.activitydescription.repository.ActivityDescriptionRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class ActivityDescriptionServiceImpl extends BaseServiceImpl<ActivityDescriptionModel, ActivityDescriptionSearchModel, ActivityDescriptionEntity, ActivityDescriptionRepository, ActivityDescriptionConverter> implements ActivityDescriptionService {
    public ActivityDescriptionServiceImpl(ActivityDescriptionRepository repository, ActivityDescriptionConverter converter) {
        super(repository, converter);
    }
}
