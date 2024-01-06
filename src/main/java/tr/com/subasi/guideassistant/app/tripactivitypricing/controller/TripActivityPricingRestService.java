package tr.com.subasi.guideassistant.app.tripactivitypricing.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingModel;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TripActivityPricingRestService extends BaseRestService<TripActivityPricingModel, TripActivityPricingSearchModel> {

}