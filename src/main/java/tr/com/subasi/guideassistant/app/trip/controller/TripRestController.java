package tr.com.subasi.guideassistant.app.trip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.trip.model.TripModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSearchModel;
import tr.com.subasi.guideassistant.app.trip.service.TripService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.trip.constant.TripConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TripRestController extends GenericRestController<TripModel, TripSearchModel> {

    public TripRestController(TripService service) {
        super(service);
    }
}
