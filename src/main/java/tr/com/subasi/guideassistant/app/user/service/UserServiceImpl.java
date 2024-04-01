package tr.com.subasi.guideassistant.app.user.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.user.converter.UserConverter;
import tr.com.subasi.guideassistant.app.user.entity.UserEntity;
import tr.com.subasi.guideassistant.app.user.model.UserModel;
import tr.com.subasi.guideassistant.app.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.app.user.repository.UserRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel, UserSearchModel, UserEntity, UserRepository, UserConverter> implements UserService {
    public UserServiceImpl(UserRepository repository, UserConverter converter) {
        super(repository, converter);
    }
}
