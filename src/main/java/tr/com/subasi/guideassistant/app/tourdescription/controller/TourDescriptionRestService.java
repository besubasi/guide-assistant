package tr.com.subasi.guideassistant.app.tourdescription.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TourDescriptionRestService extends BaseRestService<TourDescriptionModel, TourDescriptionSearchModel> {

}