package tr.com.subasi.guideassistant.app.trip.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.trip.model.TripModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TripRestService extends BaseRestService<TripModel, TripSearchModel> {

}