package tr.com.subasi.guideassistant.app.tourgallery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryContentUpdateModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryCreateModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryUpdateModel;
import tr.com.subasi.guideassistant.app.tourgallery.service.TourGalleryService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.util.List;

import static tr.com.subasi.guideassistant.app.tourgallery.constant.TourGalleryConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourGalleryRestController implements TourGalleryRestService {

    TourGalleryService service;

    public TourGalleryRestController(TourGalleryService service) {
        this.service = service;
    }

    @Override
    public ApiResponse<List<TourGalleryModel>> createAll(List<TourGalleryCreateModel> modelList) {
        return new ApiResponse<>(service.createAll(modelList));
    }

    @Override
    public ApiResponse<TourGalleryModel> create(TourGalleryCreateModel model) {
        return new ApiResponse<>(service.create(model));
    }

    @Override
    public ApiResponse<TourGalleryModel> update(TourGalleryUpdateModel model) {
        return new ApiResponse<>(service.update(model));
    }

    @Override
    public ApiResponse<TourGalleryModel> updateContent(TourGalleryContentUpdateModel model) {
        return new ApiResponse<>(service.updateContent(model));
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    public ApiResponse<TourGalleryModel> getById(Long id) {
        return new ApiResponse<>(service.getById(id));
    }

    @Override
    public ApiResponse<List<TourGalleryModel>> getListByTourId(Long tourId) {
        return new ApiResponse<>(service.getListByTourId(tourId));
    }
}