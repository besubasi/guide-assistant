package tr.com.subasi.guideassistant.app.usercompanyrel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.usercompanyrel.constant.UserCompanyRelConstant;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelModel;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.usercompanyrel.service.UserCompanyRelService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

@RestController
@RequestMapping(UserCompanyRelConstant.REQUEST_MAPPING)
public class UserCompanyRelRestController extends GenericRestController<UserCompanyRelModel, UserCompanyRelSearchModel> {

    public UserCompanyRelRestController(UserCompanyRelService service) {
        super(service);
    }
}