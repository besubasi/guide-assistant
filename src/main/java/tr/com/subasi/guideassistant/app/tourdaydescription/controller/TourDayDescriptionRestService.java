package tr.com.subasi.guideassistant.app.tourdaydescription.controller;

import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static tr.com.subasi.guideassistant.common.constant.MappingConstant.MAPPING_GET_LIST_BY_TOUR_ID;

@Validated
public interface TourDayDescriptionRestService extends BaseRestService<TourDayDescriptionModel, TourDayDescriptionSearchModel> {

    @GetMapping(value = MAPPING_GET_LIST_BY_TOUR_ID, produces = APPLICATION_JSON_VALUE)
    ApiResponse<List<TourDayDescriptionModel>> getListByTourId(@NotNull @PathVariable("tourId") Long tourId);

}