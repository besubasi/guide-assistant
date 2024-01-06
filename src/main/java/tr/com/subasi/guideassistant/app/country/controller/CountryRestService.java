package tr.com.subasi.guideassistant.app.country.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.country.model.CountryModel;
import tr.com.subasi.guideassistant.app.country.model.CountrySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface CountryRestService extends BaseRestService<CountryModel, CountrySearchModel> {

}
