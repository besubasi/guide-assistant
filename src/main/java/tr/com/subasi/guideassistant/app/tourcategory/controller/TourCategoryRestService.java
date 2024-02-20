package tr.com.subasi.guideassistant.app.tourcategory.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategoryModel;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySaveModel;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySearchModel;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

import static tr.com.subasi.guideassistant.common.constant.MappingConstant.*;

@Validated
public interface TourCategoryRestService {

    @PostMapping(value = MAPPING_SAVE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourCategoryModel> save(@Valid @RequestBody TourCategorySaveModel saveModel);

    @DeleteMapping(MAPPING_DELETE_BY_ID)
    void deleteById(@NotNull @PathVariable Long id);

    @GetMapping(value = MAPPING_GET_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourCategoryModel> getById(@NotNull @PathVariable Long id);

    @PostMapping(value = MAPPING_GET_LIST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<List<TourCategoryModel>> getList(@Valid @RequestBody TourCategorySearchModel searchModel);

    @PostMapping(value = MAPPING_GET_PAGE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<Page<TourCategoryModel>> getPage(@Valid @RequestBody TourCategorySearchModel searchModel);

}
