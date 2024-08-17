package tr.com.subasi.guideassistant.app.trip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.trip.model.*;
import tr.com.subasi.guideassistant.app.trip.service.TripService;
import tr.com.subasi.guideassistant.common.enums.EnumMessageType;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.model.MessageModel;
import tr.com.subasi.guideassistant.common.session.model.LoginResponse;

import java.util.Collections;
import java.util.List;

import static tr.com.subasi.guideassistant.app.trip.constant.TripConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TripRestController implements TripRestService {

    private final TripService service;

    public TripRestController(TripService service) {
        this.service = service;
    }

    public ApiResponse<TripSaveResponse> save(TripSaveModel model) {
        return new ApiResponse<>(service.save(model));
    }

    public void deleteById(Long id) {
        service.deleteById(id);
    }

    public ApiResponse<TripModel> getById(Long id) {
        return new ApiResponse<>(service.getById(id));
    }

    public ApiResponse<List<LookupModel>> getLookupList(TripSearchModel searchModel) {
        return new ApiResponse<>(service.getLookupList(searchModel));
    }

    public ApiResponse<List<TripModel>> getList(TripSearchModel searchModel) {
        return new ApiResponse<>(service.getList(searchModel));
    }

    @Override
    public ApiResponse<LoginResponse> joinTrip(JoinTripRequest joinTripRequest) {
        LoginResponse loginResponse = service.joinTrip(joinTripRequest);
        if (loginResponse != null)
            return new ApiResponse<>(loginResponse);

        return new ApiResponse<>(Collections.singletonList(new MessageModel(EnumMessageType.ERROR, "Belirtlen bilgilere uygun seyahat bulunamamıştır")));
    }

    @Override
    public ApiResponse<TripCompletionModel> getCompletionRate(Long id) {
        return new ApiResponse<>(service.getCompletionRate(id));
    }
}
