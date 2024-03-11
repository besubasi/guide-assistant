package tr.com.subasi.guideassistant.app.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.company.model.CompanyModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySaveModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;
import tr.com.subasi.guideassistant.app.company.service.CompanyService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;
import tr.com.subasi.guideassistant.common.controller.BaseRestController2;

import static tr.com.subasi.guideassistant.app.company.constant.CompanyConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class CompanyRestController extends BaseRestController2<CompanyService, CompanySaveModel, CompanyModel, CompanySearchModel> implements CompanyRestService {

    public CompanyRestController(CompanyService service) {
        super(service);
    }
}
