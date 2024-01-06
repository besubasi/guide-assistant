package tr.com.subasi.guideassistant.app.activitycompanyrel.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface ActivityCompanyRelRestService extends BaseRestService<ActivityCompanyRelModel, ActivityCompanyRelSearchModel> {
}
