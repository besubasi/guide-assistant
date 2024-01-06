package tr.com.subasi.guideassistant.app.exchange.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeModel;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface ExchangeRestService extends BaseRestService<ExchangeModel, ExchangeSearchModel> {

}
