package tr.com.subasi.guideassistant.app.tourcalendar.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TourCalendarRestService extends BaseRestService<TourCalendarModel, TourCalendarSearchModel> {

}