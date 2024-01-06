package tr.com.subasi.guideassistant.app.tourdaydescription.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TourDayDescriptionRestService extends BaseRestService<TourDayDescriptionModel, TourDayDescriptionSearchModel> {

}