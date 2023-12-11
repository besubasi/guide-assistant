package tr.com.subasi.guideassistant.app.activitydescription.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.activitydescription.service.ActivityDescriptionService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.activitydescription.constant.ActivityDescriptionConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class ActivityDescriptionRestController extends GenericRestController<ActivityDescriptionModel, ActivityDescriptionSearchModel> {

    public ActivityDescriptionRestController(ActivityDescriptionService service) {
        super(service);
    }
}
