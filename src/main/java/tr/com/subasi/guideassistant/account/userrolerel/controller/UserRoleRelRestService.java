package tr.com.subasi.guideassistant.account.userrolerel.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelModel;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface UserRoleRelRestService extends BaseRestService<UserRoleRelModel, UserRoleRelSearchModel> {
}
