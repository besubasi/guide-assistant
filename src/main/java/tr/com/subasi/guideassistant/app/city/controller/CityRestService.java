package tr.com.subasi.guideassistant.app.city.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.city.model.CityModel;
import tr.com.subasi.guideassistant.app.city.model.CitySaveModel;
import tr.com.subasi.guideassistant.app.city.model.CitySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;
import tr.com.subasi.guideassistant.common.controller.BaseRestService2;

@Validated
public interface CityRestService extends BaseRestService2<CitySaveModel, CityModel, CitySearchModel> {
}