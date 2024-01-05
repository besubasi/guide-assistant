package tr.com.subasi.guideassistant.app.country.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.country.model.CountryModel;
import tr.com.subasi.guideassistant.app.country.model.CountrySearchModel;
import tr.com.subasi.guideassistant.app.country.service.CountryService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.country.constant.CountryConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class CountryRestController extends BaseRestController<CountryService, CountryModel, CountrySearchModel> {

    public CountryRestController(CountryService service) {
        super(service);
    }
}
