package tr.com.subasi.guideassistant.app.tripactivitypricing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingModel;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingSearchModel;
import tr.com.subasi.guideassistant.app.tripactivitypricing.service.TripActivityPricingService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.tripactivitypricing.constant.TripActivityPricingConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TripActivityPricingRestController extends GenericRestController<TripActivityPricingModel, TripActivityPricingSearchModel> {

    public TripActivityPricingRestController(TripActivityPricingService service) {
        super(service);
    }
}
