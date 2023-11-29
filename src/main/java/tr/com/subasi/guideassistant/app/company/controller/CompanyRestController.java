package tr.com.subasi.guideassistant.app.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.company.model.CompanyModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;
import tr.com.subasi.guideassistant.app.company.service.CompanyService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.company.constant.CompanyConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class CompanyRestController extends GenericRestController<CompanyModel, CompanySearchModel> {

    public CompanyRestController(CompanyService service) {
        super(service);
    }
}
