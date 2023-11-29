package tr.com.subasi.guideassistant.app.district.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.district.model.DistrictModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;
import tr.com.subasi.guideassistant.app.district.service.DistrictService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.district.constant.DistrictConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class DistrictRestController extends GenericRestController<DistrictModel, DistrictSearchModel> {

    public DistrictRestController(DistrictService service) {
        super(service);
    }
}
