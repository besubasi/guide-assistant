package tr.com.subasi.guideassistant.account.authority.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.account.authority.constant.AuthorityConstant;
import tr.com.subasi.guideassistant.account.authority.model.AuthorityModel;
import tr.com.subasi.guideassistant.account.authority.model.AuthoritySearchModel;
import tr.com.subasi.guideassistant.account.authority.service.AuthorityService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

@RestController
@RequestMapping(AuthorityConstant.REQUEST_MAPPING)
public class AuthorityRestController extends BaseRestController<AuthorityService, AuthorityModel, AuthoritySearchModel> implements AuthorityRestService {

    public AuthorityRestController(AuthorityService service) {
        super(service);
    }
}