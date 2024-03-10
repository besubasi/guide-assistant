package tr.com.subasi.guideassistant.app.district.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.district.model.DistrictModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSaveModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;
import tr.com.subasi.guideassistant.app.district.service.DistrictService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;
import tr.com.subasi.guideassistant.common.controller.BaseRestController2;

import static tr.com.subasi.guideassistant.app.district.constant.DistrictConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class DistrictRestController extends BaseRestController2<DistrictService, DistrictSaveModel, DistrictModel, DistrictSearchModel> implements DistrictRestService{

    public DistrictRestController(DistrictService service) {
        super(service);
    }
}
