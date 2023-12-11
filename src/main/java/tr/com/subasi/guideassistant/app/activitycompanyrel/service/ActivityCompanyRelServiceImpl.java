package tr.com.subasi.guideassistant.app.activitycompanyrel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitycompanyrel.entity.ActivityCompanyRelEntity;
import tr.com.subasi.guideassistant.app.activitycompanyrel.mapper.ActivityCompanyRelMapper;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.repository.ActivityCompanyRelRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class ActivityCompanyRelServiceImpl extends GenericServiceImpl<ActivityCompanyRelModel, ActivityCompanyRelSearchModel, ActivityCompanyRelEntity> implements tr.com.subasi.guideassistant.app.activitycompanyrel.service.ActivityCompanyRelService {
    public ActivityCompanyRelServiceImpl(ActivityCompanyRelRepository repository, ActivityCompanyRelMapper mapper) {
        super(repository, mapper);
    }
}