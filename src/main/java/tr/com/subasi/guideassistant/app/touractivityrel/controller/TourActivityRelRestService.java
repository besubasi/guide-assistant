package tr.com.subasi.guideassistant.app.touractivityrel.controller;

import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tr.com.subasi.guideassistant.app.touractivityrel.model.*;
import tr.com.subasi.guideassistant.common.controller.BaseRestService2;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.util.List;

import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_GET_DETAIL;

@Validated
public interface TourActivityRelRestService extends BaseRestService2<TourActivityRelSaveModel, TourActivityRelModel, TourActivityRelSearchModel> {

    @PostMapping(value = MAPPING_GET_DETAIL, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<List<TourActivityDetailResponse>> getDetail(@Valid @RequestBody TourActivityDetailRequest request);

}
