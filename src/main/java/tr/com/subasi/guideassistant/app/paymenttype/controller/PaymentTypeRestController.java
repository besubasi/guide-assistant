package tr.com.subasi.guideassistant.app.paymenttype.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeModel;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeSearchModel;
import tr.com.subasi.guideassistant.app.paymenttype.service.PaymentTypeService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.paymenttype.constant.PaymentTypeConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class PaymentTypeRestController extends BaseRestController<PaymentTypeService, PaymentTypeModel, PaymentTypeSearchModel> {

    public PaymentTypeRestController(PaymentTypeService service) {
        super(service);
    }
}
