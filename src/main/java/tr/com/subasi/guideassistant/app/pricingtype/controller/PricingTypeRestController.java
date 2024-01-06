package tr.com.subasi.guideassistant.app.pricingtype.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeModel;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeSearchModel;
import tr.com.subasi.guideassistant.app.pricingtype.service.PricingTypeService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.pricingtype.constant.PricingTypeConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class PricingTypeRestController extends BaseRestController<PricingTypeService, PricingTypeModel, PricingTypeSearchModel> implements PricingTypeRestService {

    public PricingTypeRestController(PricingTypeService service) {
        super(service);
    }
}
