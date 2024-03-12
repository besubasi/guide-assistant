package tr.com.subasi.guideassistant.app.activitygallery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGalleryModel;
import tr.com.subasi.guideassistant.app.activitygallery.service.ActivityGalleryService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.io.IOException;
import java.util.List;

import static tr.com.subasi.guideassistant.app.activitygallery.constant.ActivityGalleryConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class ActivityGalleryRestController implements ActivityGalleryRestService {

    private final ActivityGalleryService service;

    public ActivityGalleryRestController(ActivityGalleryService service) {
        this.service = service;
    }

    @Override
    public ApiResponse<Boolean> createContentList(Long activityId, MultipartFile[] files) throws IOException {
        return new ApiResponse<>(service.createContentList(activityId, files));
    }

    @Override
    public ApiResponse<ActivityGalleryModel> updateContent(Long id, MultipartFile file) throws IOException {
        return new ApiResponse<>(service.updateContent(id, file));
    }

    @Override
    public ApiResponse<ActivityGalleryModel> save(ActivityGalleryModel model) {
        return new ApiResponse<>(service.save(model));
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    public ApiResponse<ActivityGalleryModel> getById(Long id) {
        return new ApiResponse<>(service.getById(id));
    }

    @Override
    public ApiResponse<List<ActivityGalleryModel>> getListByActivityId(Long activityId) {
        return new ApiResponse<>(service.getListByActivityId(activityId));
    }
}