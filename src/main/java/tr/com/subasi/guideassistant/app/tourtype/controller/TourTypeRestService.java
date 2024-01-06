package tr.com.subasi.guideassistant.app.tourtype.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeModel;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TourTypeRestService extends BaseRestService<TourTypeModel, TourTypeSearchModel> {

}