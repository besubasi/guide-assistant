package tr.com.subasi.guideassistant.account.role.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.account.role.constant.RoleConstant;
import tr.com.subasi.guideassistant.account.role.model.RoleModel;
import tr.com.subasi.guideassistant.account.role.model.RoleSearchModel;
import tr.com.subasi.guideassistant.account.role.service.RoleService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

@RestController
@RequestMapping(RoleConstant.REQUEST_MAPPING)
public class RoleRestController extends BaseRestController<RoleService, RoleModel, RoleSearchModel> implements RoleRestService {

    public RoleRestController(RoleService service) {
        super(service);
    }
}