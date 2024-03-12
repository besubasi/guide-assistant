package tr.com.subasi.guideassistant.app.activitydescription.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitydescription.converter.ActivityDescriptionConverter;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;
import tr.com.subasi.guideassistant.app.activitydescription.repository.ActivityDescriptionRepository;

@Service
public class ActivityDescriptionServiceImpl implements ActivityDescriptionService {

    private final ActivityDescriptionRepository repository;
    private final ActivityDescriptionConverter converter;

    public ActivityDescriptionServiceImpl(ActivityDescriptionRepository repository, ActivityDescriptionConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public ActivityDescriptionModel save(ActivityDescriptionModel model) {
        return this.converter.convertToModel(this.repository.save(this.converter.convertToEntity(model)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ActivityDescriptionModel getByActivityId(Long activityId) {
        return this.converter.convertToModel(repository.getByActivityId(activityId));
    }

}
