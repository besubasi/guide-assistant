package tr.com.subasi.guideassistant.app.tourcalendar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarBatchModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarSearchModel;
import tr.com.subasi.guideassistant.app.tourcalendar.service.TourCalendarService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import static tr.com.subasi.guideassistant.app.tourcalendar.constant.TourCalendarConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourCalendarRestController extends BaseRestController<TourCalendarService, TourCalendarModel, TourCalendarSearchModel> implements TourCalendarRestService {

    public TourCalendarRestController(TourCalendarService service) {
        super(service);
    }

    @Override
    public ApiResponse<Boolean> saveBatch(TourCalendarBatchModel batchModel) {
        return new ApiResponse<>(service.saveBatch(batchModel));
    }
}
