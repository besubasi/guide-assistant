package tr.com.subasi.guideassistant.app.trip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.trip.model.TripModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSaveModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSearchModel;
import tr.com.subasi.guideassistant.app.trip.service.TripService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

import static tr.com.subasi.guideassistant.app.trip.constant.TripConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TripRestController implements TripRestService {

    private final TripService service;

    public TripRestController(TripService service) {
        this.service = service;
    }

    public ApiResponse<Boolean> save(TripSaveModel model) {
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

    public ApiResponse<Page<TripModel>> getPage(TripSearchModel searchModel) {
        return new ApiResponse<>(service.getPage(searchModel));
    }

}
