package tr.com.subasi.guideassistant.app.tour.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tr.com.subasi.guideassistant.app.tour.model.TourDetailModel;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSaveModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

import static tr.com.subasi.guideassistant.common.constant.MappingConstant.*;

@Validated
public interface TourRestService {

    String MAPPING_GET_TOUR_DETAIL = "/getTourDetail/{id}";

    @PostMapping(value = MAPPING_SAVE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourSaveModel> save(@Valid @RequestBody TourSaveModel model);

    @DeleteMapping(MAPPING_DELETE_BY_ID)
    void deleteById(@NotNull @PathVariable Long id);

    @GetMapping(value = MAPPING_GET_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourModel> getById(@NotNull @PathVariable("id") Long id);

    @PostMapping(value = MAPPING_GET_LIST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<List<TourModel>> getList(@Valid @RequestBody TourSearchModel searchModel);

    @PostMapping(value = MAPPING_GET_PAGE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<Page<TourModel>> getPage(@Valid @RequestBody TourSearchModel searchModel);

    @GetMapping(value = MAPPING_GET_TOUR_DETAIL, produces = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourDetailModel> getTourDetail(@NotNull @PathVariable("id") Long id);

}
