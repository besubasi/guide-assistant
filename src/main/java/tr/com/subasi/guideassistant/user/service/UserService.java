package tr.com.subasi.guideassistant.user.service;

import tr.com.subasi.guideassistant.user.model.UserModel;
import tr.com.subasi.guideassistant.user.model.UserSearchModel;

import java.util.List;

public interface UserService {

    UserModel save(UserModel userModel);

    void deleteById(long id);

    UserModel getById(long id);

    List<UserModel> getList();

    List<UserModel> getPage(UserSearchModel userSearchModel);

}
