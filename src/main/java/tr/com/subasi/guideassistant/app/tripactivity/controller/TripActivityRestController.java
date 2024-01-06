package tr.com.subasi.guideassistant.app.tripactivity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivityModel;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivitySearchModel;
import tr.com.subasi.guideassistant.app.tripactivity.service.TripActivityService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.tripactivity.constant.TripActivityConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TripActivityRestController extends BaseRestController<TripActivityService, TripActivityModel, TripActivitySearchModel> implements TripActivityRestService{

    public TripActivityRestController(TripActivityService service) {
        super(service);
    }
}
