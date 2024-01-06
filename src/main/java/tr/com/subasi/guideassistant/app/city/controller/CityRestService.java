package tr.com.subasi.guideassistant.app.city.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.city.model.CityModel;
import tr.com.subasi.guideassistant.app.city.model.CitySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface CityRestService extends BaseRestService<CityModel, CitySearchModel> {
}