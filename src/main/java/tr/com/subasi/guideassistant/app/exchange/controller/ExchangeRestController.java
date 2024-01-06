package tr.com.subasi.guideassistant.app.exchange.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeModel;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeSearchModel;
import tr.com.subasi.guideassistant.app.exchange.service.ExchangeService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.exchange.constant.ExchangeConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class ExchangeRestController extends BaseRestController<ExchangeService, ExchangeModel, ExchangeSearchModel> implements ExchangeRestService{

    public ExchangeRestController(ExchangeService service) {
        super(service);
    }
}
