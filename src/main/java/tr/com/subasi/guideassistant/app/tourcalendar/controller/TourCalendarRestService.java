package tr.com.subasi.guideassistant.app.tourcalendar.controller;

import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarBatchModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_SAVE_BATCH;

@Validated
public interface TourCalendarRestService extends BaseRestService<TourCalendarModel, TourCalendarSearchModel> {

    @PostMapping(value = MAPPING_SAVE_BATCH, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<Boolean> saveBatch(@Valid @RequestBody TourCalendarBatchModel batchModel);


}