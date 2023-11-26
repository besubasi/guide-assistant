package tr.com.subasi.guideassistant.app.city.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.city.model.CityModel;
import tr.com.subasi.guideassistant.app.city.model.CitySearchModel;
import tr.com.subasi.guideassistant.app.city.service.CityService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.city.constant.CityConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class CityRestController extends GenericRestController<CityModel, CitySearchModel> {

    public CityRestController(CityService service) {
        super(service);
    }
}
