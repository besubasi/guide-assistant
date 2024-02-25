package tr.com.subasi.guideassistant.app.tourdescription.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdescription.service.TourDescriptionService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import static tr.com.subasi.guideassistant.app.tourdescription.constant.TourDescriptionConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourDescriptionRestController implements TourDescriptionRestService {

    private final TourDescriptionService service;

    public TourDescriptionRestController(TourDescriptionService service) {
        this.service = service;
    }


    @Override
    public ApiResponse<TourDescriptionModel> save(TourDescriptionModel model) {
        return new ApiResponse<>(this.service.save(model));
    }

    @Override
    public void deleteById(Long id) {
        this.service.deleteById(id);
    }

    @Override
    public ApiResponse<TourDescriptionModel> getByTourId(Long tourId) {
        return new ApiResponse<>(this.service.getByTourId(tourId));
    }
}
