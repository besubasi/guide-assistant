package tr.com.subasi.guideassistant.app.tourcategory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategoryModel;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySearchModel;
import tr.com.subasi.guideassistant.app.tourcategory.service.TourCategoryService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.tourcategory.constant.TourCategoryConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class TourCategoryRestController extends GenericRestController<TourCategoryModel, TourCategorySearchModel> {

    public TourCategoryRestController(TourCategoryService service) {
        super(service);
    }
}
