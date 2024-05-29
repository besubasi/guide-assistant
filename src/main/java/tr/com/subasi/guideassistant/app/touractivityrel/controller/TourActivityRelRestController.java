package tr.com.subasi.guideassistant.app.touractivityrel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.touractivityrel.constant.TourActivityRelConstant;
import tr.com.subasi.guideassistant.app.touractivityrel.model.*;
import tr.com.subasi.guideassistant.app.touractivityrel.service.TourActivityRelService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController2;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.util.List;

@RestController
@RequestMapping(TourActivityRelConstant.REQUEST_MAPPING)
public class TourActivityRelRestController extends BaseRestController2<TourActivityRelService, TourActivityRelSaveModel, TourActivityRelModel, TourActivityRelSearchModel> implements TourActivityRelRestService {

    public TourActivityRelRestController(TourActivityRelService service) {
        super(service);
    }

    @Override
    public ApiResponse<List<TourActivityDetailResponse>> getDetail(TourActivityDetailRequest request) {
        return new ApiResponse<>(service.getDetail(request));
    }
}