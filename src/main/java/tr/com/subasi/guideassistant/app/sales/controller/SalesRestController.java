package tr.com.subasi.guideassistant.app.sales.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.sales.model.SalesModel;
import tr.com.subasi.guideassistant.app.sales.model.SalesSearchModel;
import tr.com.subasi.guideassistant.app.sales.service.SalesService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.sales.constant.SalesConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class SalesRestController extends BaseRestController<SalesService, SalesModel, SalesSearchModel> implements SalesRestService {

    public SalesRestController(SalesService service) {
        super(service);
    }
}
