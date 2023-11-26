package tr.com.subasi.guideassistant.account.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.account.user.constant.UserConstant;
import tr.com.subasi.guideassistant.account.user.model.UserModel;
import tr.com.subasi.guideassistant.account.user.service.UserService;
import tr.com.subasi.guideassistant.account.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

@RestController
@RequestMapping(UserConstant.REQUEST_MAPPING)
public class UserRestController extends GenericRestController<UserModel, UserSearchModel> {

    public UserRestController(UserService service) {
        super(service);
    }
}
