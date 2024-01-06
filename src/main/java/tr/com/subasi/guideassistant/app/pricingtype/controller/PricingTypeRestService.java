package tr.com.subasi.guideassistant.app.pricingtype.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeModel;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface PricingTypeRestService extends BaseRestService<PricingTypeModel, PricingTypeSearchModel> {

}