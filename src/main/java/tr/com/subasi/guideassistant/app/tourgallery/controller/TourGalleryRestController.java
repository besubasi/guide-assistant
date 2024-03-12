package tr.com.subasi.guideassistant.app.tourgallery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.app.tourgallery.service.TourGalleryService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.io.IOException;
import java.util.List;

import static tr.com.subasi.guideassistant.app.tourgallery.constant.TourGalleryConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourGalleryRestController implements TourGalleryRestService {

    private final TourGalleryService service;

    public TourGalleryRestController(TourGalleryService service) {
        this.service = service;
    }

    @Override
    public ApiResponse<Boolean> createContentList(Long tourId, MultipartFile[] files) throws IOException {
        return new ApiResponse<>(service.createContentList(tourId, files));
    }

    @Override
    public ApiResponse<TourGalleryModel> updateContent(Long id, MultipartFile file) throws IOException {
        return new ApiResponse<>(service.updateContent(id, file));
    }

    @Override
    public ApiResponse<TourGalleryModel> save(TourGalleryModel model) {
        return new ApiResponse<>(service.save(model));
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