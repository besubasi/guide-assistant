package tr.com.subasi.guideassistant.app.activitydescription.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitydescription.entity.ActivityDescriptionEntity;
import tr.com.subasi.guideassistant.app.activitydescription.mapper.ActivityDescriptionMapper;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.activitydescription.repository.ActivityDescriptionRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class ActivityDescriptionServiceImpl extends GenericServiceImpl<ActivityDescriptionModel, ActivityDescriptionSearchModel, ActivityDescriptionEntity> implements tr.com.subasi.guideassistant.app.activitydescription.service.ActivityDescriptionService {
    public ActivityDescriptionServiceImpl(ActivityDescriptionRepository repository, ActivityDescriptionMapper mapper) {
        super(repository, mapper);
    }
}
