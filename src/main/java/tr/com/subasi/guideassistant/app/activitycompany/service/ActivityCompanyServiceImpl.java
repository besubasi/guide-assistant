package tr.com.subasi.guideassistant.app.activitycompany.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitycompany.entity.ActivityCompanyEntity;
import tr.com.subasi.guideassistant.app.activitycompany.mapper.ActivityCompanyMapper;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanyModel;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanySearchModel;
import tr.com.subasi.guideassistant.app.activitycompany.repository.ActivityCompanyRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class ActivityCompanyServiceImpl extends GenericServiceImpl<ActivityCompanyModel, ActivityCompanySearchModel, ActivityCompanyEntity> implements tr.com.subasi.guideassistant.app.activitycompany.service.ActivityCompanyService {
    public ActivityCompanyServiceImpl(ActivityCompanyRepository repository, ActivityCompanyMapper mapper) {
        super(repository, mapper);
    }
}
