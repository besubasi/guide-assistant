package tr.com.subasi.guideassistant.app.activitygallery.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGalleryModel;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGallerySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface ActivityGalleryRestService extends BaseRestService<ActivityGalleryModel, ActivityGallerySearchModel> {
}
