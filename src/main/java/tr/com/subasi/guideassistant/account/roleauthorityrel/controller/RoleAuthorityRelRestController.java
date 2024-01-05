package tr.com.subasi.guideassistant.account.roleauthorityrel.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.account.roleauthorityrel.constant.RoleAuthorityRelConstant;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelSearchModel;
import tr.com.subasi.guideassistant.account.roleauthorityrel.service.RoleAuthorityRelService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

@RestController
@RequestMapping(RoleAuthorityRelConstant.REQUEST_MAPPING)
public class RoleAuthorityRelRestController extends BaseRestController<RoleAuthorityRelService, RoleAuthorityRelModel, RoleAuthorityRelSearchModel> implements RoleAuthorityRelRestService{

    public RoleAuthorityRelRestController(RoleAuthorityRelService service) {
        super(service);
    }
}