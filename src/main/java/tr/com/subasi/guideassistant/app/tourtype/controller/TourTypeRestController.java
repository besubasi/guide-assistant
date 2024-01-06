package tr.com.subasi.guideassistant.app.tourtype.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeModel;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeSearchModel;
import tr.com.subasi.guideassistant.app.tourtype.service.TourTypeService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.tourtype.constant.TourTypeConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourTypeRestController extends BaseRestController<TourTypeService, TourTypeModel, TourTypeSearchModel> implements TourTypeRestService {

    public TourTypeRestController(TourTypeService service) {
        super(service);
    }
}
