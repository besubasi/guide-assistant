package tr.com.subasi.guideassistant.app.currency.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.currency.model.CurrencyModel;
import tr.com.subasi.guideassistant.app.currency.model.CurrencySearchModel;
import tr.com.subasi.guideassistant.app.currency.service.CurrencyService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.currency.constant.CurrencyConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class CurrencyRestController extends GenericRestController<CurrencyModel, CurrencySearchModel> {

    public CurrencyRestController(CurrencyService service) {
        super(service);
    }
}
