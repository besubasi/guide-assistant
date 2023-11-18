package tr.com.subasi.guideassistant.user.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.user.mapper.UserMapper;
import tr.com.subasi.guideassistant.user.model.UserModel;
import tr.com.subasi.guideassistant.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.user.repository.UserRepository;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);


    private UserRepository userRepository;
    private UserMapper userMapper;


    @Override
    public UserModel save(UserModel userModel) {
        return this.userMapper.convertToModel(this.userRepository.save(this.userMapper.convertToEntity(userModel)));
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserModel getById(long id) {
        return this.userMapper.convertToModel(userRepository.getReferenceById(id));
    }

    @Override
    public List<UserModel> getList(UserSearchModel userSearchModel) {
        LOGGER.info("UserSearchModel : " + userSearchModel);
        return this.userMapper.convertToModelList(userRepository.findAll());
    }

    @Override
    public List<UserModel> getPage(UserSearchModel userSearchModel) {
        LOGGER.info("UserSearchModel : " + userSearchModel);
        return Collections.emptyList();
    }

}
