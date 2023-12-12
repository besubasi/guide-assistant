package tr.com.subasi.guideassistant.app.tripcustomer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerModel;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerSearchModel;
import tr.com.subasi.guideassistant.app.tripcustomer.service.TripCustomerService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.tripcustomer.constant.TripCustomerConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TripCustomerRestController extends GenericRestController<TripCustomerModel, TripCustomerSearchModel> {

    public TripCustomerRestController(TripCustomerService service) {
        super(service);
    }
}
