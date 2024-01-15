package tr.com.subasi.guideassistant.app.tour.controller;

import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_GET_LIST2;
import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_GET_PAGE2;

@Validated
public interface TourRestService extends BaseRestService<TourModel, TourSearchModel> {
    @PostMapping(value = MAPPING_GET_LIST2, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<List<TourModel>> getList2(@Valid @RequestBody TourSearchModel searchModel);

    @PostMapping(value = MAPPING_GET_PAGE2, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<Page<TourModel>> getPage2(@Valid @RequestBody TourSearchModel searchModel);
}
