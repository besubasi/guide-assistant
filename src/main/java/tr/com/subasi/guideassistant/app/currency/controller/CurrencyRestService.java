package tr.com.subasi.guideassistant.app.currency.controller;


import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.currency.model.CurrencyModel;
import tr.com.subasi.guideassistant.app.currency.model.CurrencySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface CurrencyRestService extends BaseRestService<CurrencyModel, CurrencySearchModel> {

}
