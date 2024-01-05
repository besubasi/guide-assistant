package tr.com.subasi.guideassistant.app.activitycompany.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitycompany.converter.ActivityCompanyConverter;
import tr.com.subasi.guideassistant.app.activitycompany.entity.ActivityCompanyEntity;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanyModel;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanySearchModel;
import tr.com.subasi.guideassistant.app.activitycompany.repository.ActivityCompanyRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class ActivityCompanyServiceImpl extends BaseServiceImpl<ActivityCompanyModel, ActivityCompanySearchModel, ActivityCompanyEntity, ActivityCompanyRepository, ActivityCompanyConverter> implements ActivityCompanyService {
    public ActivityCompanyServiceImpl(ActivityCompanyRepository repository, ActivityCompanyConverter converter) {
         super(repository, converter);
    }
}
