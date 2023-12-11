package tr.com.subasi.guideassistant.app.activity.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activity.mapper.ActivityMapper;
import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.activity.model.ActivitySearchModel;
import tr.com.subasi.guideassistant.app.activity.repository.ActivityRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class ActivityServiceImpl extends GenericServiceImpl<ActivityModel, ActivitySearchModel, ActivityEntity> implements tr.com.subasi.guideassistant.app.activity.service.ActivityService {
    public ActivityServiceImpl(ActivityRepository repository, ActivityMapper mapper) {
        super(repository, mapper);
    }
}
