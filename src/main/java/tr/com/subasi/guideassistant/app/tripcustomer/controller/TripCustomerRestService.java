package tr.com.subasi.guideassistant.app.tripcustomer.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerModel;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TripCustomerRestService extends BaseRestService<TripCustomerModel, TripCustomerSearchModel> {

}