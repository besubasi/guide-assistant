package tr.com.subasi.guideassistant.app.activitycompany.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanyModel;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface ActivityCompanyRestService extends BaseRestService<ActivityCompanyModel, ActivityCompanySearchModel> {
}
