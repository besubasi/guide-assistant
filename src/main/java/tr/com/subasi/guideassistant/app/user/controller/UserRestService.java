package tr.com.subasi.guideassistant.app.user.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.user.model.UserModel;
import tr.com.subasi.guideassistant.app.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface UserRestService extends BaseRestService<UserModel, UserSearchModel> {
}
