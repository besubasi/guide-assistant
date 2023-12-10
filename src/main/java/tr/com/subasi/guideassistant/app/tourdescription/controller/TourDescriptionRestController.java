package tr.com.subasi.guideassistant.app.tourdescription.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.tourdescription.service.TourDescriptionService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.tourdescription.constant.TourDescriptionConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourDescriptionRestController extends GenericRestController<TourDescriptionModel, TourDescriptionSearchModel> {

    public TourDescriptionRestController(TourDescriptionService service) {
        super(service);
    }
}
