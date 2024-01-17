package tr.com.subasi.guideassistant.app.activitygallery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGalleryModel;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGallerySearchModel;
import tr.com.subasi.guideassistant.app.activitygallery.service.ActivityGalleryService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.activitygallery.constant.ActivityGalleryConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class ActivityGalleryRestController extends BaseRestController<ActivityGalleryService, ActivityGalleryModel, ActivityGallerySearchModel> implements ActivityGalleryRestService{

    public ActivityGalleryRestController(ActivityGalleryService service) {
        super(service);
    }
}