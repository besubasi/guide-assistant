package tr.com.subasi.guideassistant.account.authority.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.account.authority.constant.AuthorityConstant;
import tr.com.subasi.guideassistant.account.authority.model.AuthorityModel;
import tr.com.subasi.guideassistant.account.authority.model.AuthoritySearchModel;
import tr.com.subasi.guideassistant.account.authority.service.AuthorityService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

@RestController
@RequestMapping(AuthorityConstant.REQUEST_MAPPING)
public class AuthorityRestController extends GenericRestController<AuthorityModel, AuthoritySearchModel> {

    public AuthorityRestController(AuthorityService service) {
        super(service);
    }
}