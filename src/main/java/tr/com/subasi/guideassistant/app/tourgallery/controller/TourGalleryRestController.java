package tr.com.subasi.guideassistant.app.tourgallery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGallerySearchModel;
import tr.com.subasi.guideassistant.app.tourgallery.service.TourGalleryService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.tourgallery.constant.TourGalleryConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourGalleryRestController extends BaseRestController<TourGalleryService, TourGalleryModel, TourGallerySearchModel> implements TourGalleryRestService{

    public TourGalleryRestController(TourGalleryService service) {
        super(service);
    }
}