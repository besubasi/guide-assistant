package tr.com.subasi.guideassistant.app.activity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.activity.model.ActivitySearchModel;
import tr.com.subasi.guideassistant.app.activity.service.ActivityService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.activity.constant.ActivityConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class ActivityRestController extends GenericRestController<ActivityModel, ActivitySearchModel> {

    public ActivityRestController(ActivityService service) {
        super(service);
    }
}
