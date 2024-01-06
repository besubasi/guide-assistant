package tr.com.subasi.guideassistant.app.paymenttype.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeModel;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface PaymentTypeRestService extends BaseRestService<PaymentTypeModel, PaymentTypeSearchModel> {

}