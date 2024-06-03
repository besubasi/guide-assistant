package tr.com.subasi.guideassistant.app.trip.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tr.com.subasi.guideassistant.app.trip.model.*;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.session.model.LoginResponse;

import java.util.List;

import static tr.com.subasi.guideassistant.common.constant.MappingConstant.*;

@Validated
public interface TripRestService {

    @PostMapping(value = MAPPING_SAVE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TripSaveResponse> save(@Valid @RequestBody TripSaveModel model);

    @DeleteMapping(MAPPING_DELETE_BY_ID)
    void deleteById(@NotNull @PathVariable("id") Long id);

    @GetMapping(value = MAPPING_GET_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TripModel> getById(@NotNull @PathVariable("id") Long id);

    @PostMapping(value = MAPPING_GET_LOOKUP_LIST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<List<LookupModel>> getLookupList(@Valid @RequestBody TripSearchModel searchModel);

    @PostMapping(value = MAPPING_GET_LIST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<List<TripModel>> getList(@Valid @RequestBody TripSearchModel searchModel);

    @PostMapping(value = MAPPING_JOIN, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<LoginResponse> joinTrip(@Valid @RequestBody JoinTripRequest joinTripRequest);


}