package tr.com.subasi.guideassistant.app.usercompanyrel.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelModel;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface UserCompanyRelRestService extends BaseRestService<UserCompanyRelModel, UserCompanyRelSearchModel> {

}