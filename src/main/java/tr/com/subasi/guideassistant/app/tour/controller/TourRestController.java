package tr.com.subasi.guideassistant.app.tour.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tour.model.TourDetailModel;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSaveModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tour.service.TourService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

import static tr.com.subasi.guideassistant.app.tour.constant.TourConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourRestController implements TourRestService {

    private final TourService service;

    public TourRestController(TourService service) {
        this.service = service;
    }

    public ApiResponse<TourSaveModel> save(TourSaveModel model) {
        return new ApiResponse<>(service.save(model));
    }

    public void deleteById(Long id) {
        service.deleteById(id);
    }

    public ApiResponse<TourModel> getById(Long id) {
        return new ApiResponse<>(service.getById(id));
    }

    public ApiResponse<List<TourModel>> getList(TourSearchModel searchModel) {
        return new ApiResponse<>(service.getList(searchModel));
    }

    public ApiResponse<Page<TourModel>> getPage(TourSearchModel searchModel) {
        return new ApiResponse<>(service.getPage(searchModel));
    }

    @Override
    public ApiResponse<TourDetailModel> getTourDetail(Long id) {
        return new ApiResponse<>(service.getTourDetail(id));
    }

}
