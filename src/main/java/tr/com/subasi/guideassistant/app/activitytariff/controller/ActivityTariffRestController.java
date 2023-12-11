package tr.com.subasi.guideassistant.app.activitytariff.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffModel;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSearchModel;
import tr.com.subasi.guideassistant.app.activitytariff.service.ActivityTariffService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.activitytariff.constant.ActivityTariffConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class ActivityTariffRestController extends GenericRestController<ActivityTariffModel, ActivityTariffSearchModel> {

    public ActivityTariffRestController(ActivityTariffService service) {
        super(service);
    }
}
