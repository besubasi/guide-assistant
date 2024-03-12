package tr.com.subasi.guideassistant.app.tourdescription.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_DELETE_BY_ID;
import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_GET_BY_TOUR_ID;
import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_SAVE;

@Validated
public interface TourDescriptionRestService {

    @PostMapping(value = MAPPING_SAVE, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    ApiResponse<TourDescriptionModel> save(@Valid @RequestBody TourDescriptionModel model);

    @DeleteMapping(MAPPING_DELETE_BY_ID)
    void deleteById(@NotNull @PathVariable("id") Long id);

    @GetMapping(value = MAPPING_GET_BY_TOUR_ID, produces = APPLICATION_JSON_VALUE)
    ApiResponse<TourDescriptionModel> getByTourId(@NotNull @PathVariable("tourId") Long tourId);

}