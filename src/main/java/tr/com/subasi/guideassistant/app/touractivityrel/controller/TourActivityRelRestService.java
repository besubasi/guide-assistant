package tr.com.subasi.guideassistant.app.touractivityrel.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TourActivityRelRestService extends BaseRestService<TourActivityRelModel, TourActivityRelSearchModel> {

}
