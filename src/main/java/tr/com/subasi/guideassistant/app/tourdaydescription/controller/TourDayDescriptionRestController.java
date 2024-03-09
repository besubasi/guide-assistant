package tr.com.subasi.guideassistant.app.tourdaydescription.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.service.TourDayDescriptionService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.util.List;

import static tr.com.subasi.guideassistant.app.tourdaydescription.constant.TourDayDescriptionConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourDayDescriptionRestController extends BaseRestController<TourDayDescriptionService, TourDayDescriptionModel, TourDayDescriptionSearchModel> implements TourDayDescriptionRestService {

    public TourDayDescriptionRestController(TourDayDescriptionService service) {
        super(service);
    }

    @Override
    public ApiResponse<List<TourDayDescriptionModel>> getListByTourId(Long tourId) {
        return new ApiResponse<>(service.getListByTourId(tourId));
    }
}
