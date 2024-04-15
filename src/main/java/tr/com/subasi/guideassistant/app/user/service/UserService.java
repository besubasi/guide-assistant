package tr.com.subasi.guideassistant.app.user.service;

import jakarta.validation.constraints.NotNull;
import tr.com.subasi.guideassistant.app.user.GuideUserModel;
import tr.com.subasi.guideassistant.app.user.model.UserModel;
import tr.com.subasi.guideassistant.app.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.common.service.BaseService;

public interface UserService extends BaseService<UserModel, UserSearchModel> {

    GuideUserModel saveGuideUser(@NotNull GuideUserModel model);

}
