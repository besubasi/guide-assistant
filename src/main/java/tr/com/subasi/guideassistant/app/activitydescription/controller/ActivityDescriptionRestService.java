package tr.com.subasi.guideassistant.app.activitydescription.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static tr.com.subasi.guideassistant.common.constant.MappingConstant.*;

@Validated
public interface ActivityDescriptionRestService {

    @PostMapping(value = MAPPING_SAVE, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    ApiResponse<ActivityDescriptionModel> save(@Valid @RequestBody ActivityDescriptionModel model);

    @DeleteMapping(MAPPING_DELETE_BY_ID)
    void deleteById(@NotNull @PathVariable("id") Long id);

    @GetMapping(value = MAPPING_GET_BY_ACTIVITY_ID, produces = APPLICATION_JSON_VALUE)
    ApiResponse<ActivityDescriptionModel> getByActivityId(@NotNull @PathVariable("activityId") Long activityId);

}