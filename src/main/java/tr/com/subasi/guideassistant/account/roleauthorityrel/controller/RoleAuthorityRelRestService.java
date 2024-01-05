package tr.com.subasi.guideassistant.account.roleauthorityrel.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface RoleAuthorityRelRestService extends BaseRestService<RoleAuthorityRelModel, RoleAuthorityRelSearchModel> {
}