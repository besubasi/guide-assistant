package tr.com.subasi.guideassistant.app.tour.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tour.service.TourService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

import static tr.com.subasi.guideassistant.app.tour.constant.TourConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourRestController extends BaseRestController<TourService, TourModel, TourSearchModel> implements TourRestService {

    public TourRestController(TourService service) {
        super(service);
    }

    @Override
    public ApiResponse<List<TourModel>> getList2(TourSearchModel searchModel) {
        return new ApiResponse<>(service.getList(searchModel));
    }

    @Override
    public ApiResponse<Page<TourModel>> getPage2(TourSearchModel searchModel) {
        return new ApiResponse<>(service.getPage2(searchModel));
    }
}
