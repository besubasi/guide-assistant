package tr.com.subasi.guideassistant.app.activitycompanyrel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.activitycompanyrel.constant.ActivityCompanyRelConstant;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.service.ActivityCompanyRelService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

@RestController
@RequestMapping(ActivityCompanyRelConstant.REQUEST_MAPPING)
public class ActivityCompanyRelRestController extends BaseRestController<ActivityCompanyRelService, ActivityCompanyRelModel, ActivityCompanyRelSearchModel> {

    public ActivityCompanyRelRestController(ActivityCompanyRelService service) {
        super(service);
    }
}