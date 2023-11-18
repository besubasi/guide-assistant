package tr.com.subasi.guideassistant.user.service;

import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.user.entity.UserEntity;
import tr.com.subasi.guideassistant.user.model.UserModel;
import tr.com.subasi.guideassistant.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.user.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);


    private UserRepository userRepository;


    @Override
    public UserModel save(UserModel userModel) {
        return this.convertToModel(this.userRepository.save(this.convertToEntity(userModel)));
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserModel getById(long id) {
        Optional<UserEntity> byId = userRepository.findById(id);
        return this.convertToModel(byId);
    }

    @Override
    public List<UserModel> getList() {
        return this.convertToModel(userRepository.findAll());
    }

    @Override
    public List<UserModel> getPage(UserSearchModel userSearchModel) {
        LOGGER.info("UserSearchModel : " + userSearchModel);
        return Collections.emptyList();
    }

    private List<UserModel> convertToModel(List<UserEntity> userEntityList) {
        List<UserModel> userModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(userEntityList).forEach(userEntity -> userModelList.add(this.convertToModel(userEntity)));
        return userModelList;
    }

    private UserModel convertToModel(Optional<UserEntity> optionalUserEntity) {
        return optionalUserEntity.map(this::convertToModel).orElse(null);
    }

    private UserModel convertToModel(UserEntity userEntity) {
        UserModel userModel = new UserModel();
        userModel.setId(userEntity.getId());
        userModel.setUserName(userEntity.getUserName());
        userModel.setName(userEntity.getName());
        userModel.setSurname(userEntity.getSurname());
        userModel.setEmail(userEntity.getEmail());
        return userModel;
    }

    private UserEntity convertToEntity(UserModel userModel) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userModel.getId());
        userEntity.setUserName(userModel.getUserName());
        userEntity.setName(userModel.getName());
        userEntity.setSurname(userModel.getSurname());
        userEntity.setEmail(userModel.getEmail());
        return userEntity;
    }
}
