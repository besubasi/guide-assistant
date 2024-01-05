package tr.com.subasi.guideassistant.account.authority.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.account.authority.model.AuthorityModel;
import tr.com.subasi.guideassistant.account.authority.model.AuthoritySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface AuthorityRestService extends BaseRestService<AuthorityModel, AuthoritySearchModel> {
}