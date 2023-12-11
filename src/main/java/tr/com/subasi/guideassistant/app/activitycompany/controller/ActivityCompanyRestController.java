package tr.com.subasi.guideassistant.app.activitycompany.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanyModel;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanySearchModel;
import tr.com.subasi.guideassistant.app.activitycompany.service.ActivityCompanyService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.activitycompany.constant.ActivityCompanyConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class ActivityCompanyRestController extends GenericRestController<ActivityCompanyModel, ActivityCompanySearchModel> {

    public ActivityCompanyRestController(ActivityCompanyService service) {
        super(service);
    }
}
