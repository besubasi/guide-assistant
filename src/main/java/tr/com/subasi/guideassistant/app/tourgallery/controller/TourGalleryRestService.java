package tr.com.subasi.guideassistant.app.tourgallery.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGallerySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface TourGalleryRestService extends BaseRestService<TourGalleryModel, TourGallerySearchModel> {
}
