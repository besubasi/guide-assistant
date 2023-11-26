package tr.com.subasi.guideassistant.account.userrolerel.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.account.userrolerel.constant.UserRoleRelConstant;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelModel;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelSearchModel;
import tr.com.subasi.guideassistant.account.userrolerel.service.UserRoleRelService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

@RestController
@RequestMapping(UserRoleRelConstant.REQUEST_MAPPING)
public class UserRoleRelRestController extends GenericRestController<UserRoleRelModel, UserRoleRelSearchModel> {

    public UserRoleRelRestController(UserRoleRelService service) {
        super(service);
    }
}