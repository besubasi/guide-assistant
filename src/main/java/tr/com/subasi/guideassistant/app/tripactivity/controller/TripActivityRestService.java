package tr.com.subasi.guideassistant.app.tripactivity.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivityModel;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivitySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TripActivityRestService extends BaseRestService<TripActivityModel, TripActivitySearchModel> {

}