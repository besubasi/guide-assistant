package tr.com.subasi.guideassistant.app.sales.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.sales.model.SalesModel;
import tr.com.subasi.guideassistant.app.sales.model.SalesSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface SalesRestService extends BaseRestService<SalesModel, SalesSearchModel> {

}
