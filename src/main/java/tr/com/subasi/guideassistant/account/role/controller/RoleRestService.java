package tr.com.subasi.guideassistant.account.role.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.account.role.model.RoleModel;
import tr.com.subasi.guideassistant.account.role.model.RoleSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface RoleRestService extends BaseRestService<RoleModel, RoleSearchModel> {
}
