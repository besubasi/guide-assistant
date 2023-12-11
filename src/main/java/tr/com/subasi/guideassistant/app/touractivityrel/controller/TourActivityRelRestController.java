package tr.com.subasi.guideassistant.app.touractivityrel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.touractivityrel.constant.TourActivityRelConstant;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;
import tr.com.subasi.guideassistant.app.touractivityrel.service.TourActivityRelService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

@RestController
@RequestMapping(TourActivityRelConstant.REQUEST_MAPPING)
public class TourActivityRelRestController extends GenericRestController<TourActivityRelModel, TourActivityRelSearchModel> {

    public TourActivityRelRestController(TourActivityRelService service) {
        super(service);
    }
}