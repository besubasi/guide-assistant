package tr.com.subasi.guideassistant.app.activitycompanyrel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitycompanyrel.converter.ActivityCompanyRelConverter;
import tr.com.subasi.guideassistant.app.activitycompanyrel.entity.ActivityCompanyRelEntity;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.repository.ActivityCompanyRelRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class ActivityCompanyRelServiceImpl extends BaseServiceImpl<ActivityCompanyRelModel, ActivityCompanyRelSearchModel, ActivityCompanyRelEntity, ActivityCompanyRelRepository, ActivityCompanyRelConverter> implements ActivityCompanyRelService {
    public ActivityCompanyRelServiceImpl(ActivityCompanyRelRepository repository, ActivityCompanyRelConverter converter) {
        super(repository, converter);
    }
}