package tr.com.subasi.guideassistant.app.tourdaydescription.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.service.TourDayDescriptionService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.tourdaydescription.constant.TourDayDescriptionConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourDayDescriptionRestController extends GenericRestController<TourDayDescriptionModel, TourDayDescriptionSearchModel> {

    public TourDayDescriptionRestController(TourDayDescriptionService service) {
        super(service);
    }
}
