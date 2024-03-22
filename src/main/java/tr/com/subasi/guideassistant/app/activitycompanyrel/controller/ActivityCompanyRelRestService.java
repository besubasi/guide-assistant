package tr.com.subasi.guideassistant.app.activitycompanyrel.controller;

import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSaveModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarBatchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService2;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.util.List;

import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_SAVE_BATCH;

@Validated
public interface ActivityCompanyRelRestService extends BaseRestService2<ActivityCompanyRelSaveModel, ActivityCompanyRelModel, ActivityCompanyRelSearchModel> {

    @PostMapping(value = MAPPING_SAVE_BATCH, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<Boolean> saveBatch(@Valid @RequestBody List<ActivityCompanyRelSaveModel> modelList);


}
