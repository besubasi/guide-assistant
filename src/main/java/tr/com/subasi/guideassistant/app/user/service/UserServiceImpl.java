package tr.com.subasi.guideassistant.app.user.service;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.user.GuideUserModel;
import tr.com.subasi.guideassistant.app.user.converter.UserConverter;
import tr.com.subasi.guideassistant.app.user.entity.UserEntity;
import tr.com.subasi.guideassistant.app.user.model.UserModel;
import tr.com.subasi.guideassistant.app.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.app.user.repository.UserRepository;
import tr.com.subasi.guideassistant.app.usercompanyrel.entity.UserCompanyRelEntity;
import tr.com.subasi.guideassistant.app.usercompanyrel.repository.UserCompanyRelRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel, UserSearchModel, UserEntity, UserRepository, UserConverter> implements UserService {

    private final UserCompanyRelRepository userCompanyRelRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository repository, UserConverter converter, UserCompanyRelRepository userCompanyRelRepository,
                           BCryptPasswordEncoder bCryptPasswordEncoder) {
        super(repository, converter);
        this.userCompanyRelRepository = userCompanyRelRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public GuideUserModel saveGuideUser(GuideUserModel model) {
        if (StringUtils.isBlank(model.getUsername()))
            model.setUsername(model.getPhoneNumber());

        UserEntity entity = this.converter.convertToEntityByGuideUser(model);
        if (StringUtils.isBlank(entity.getPassword())) {
            entity.setPassword(bCryptPasswordEncoder.encode("1234"));
        } else {
            entity.setPassword(bCryptPasswordEncoder.encode(entity.getPassword()));
        }

        UserEntity userEntity = this.repository.findByUsername(model.getUsername());
        if (userEntity != null) {
            GuideUserModel guideUserModel = this.converter.convertToGuideUserModel(userEntity);
            guideUserModel.setCompanyIdList(model.getCompanyIdList());
            return guideUserModel;
        } else {
            GuideUserModel guideUserModel = this.converter.convertToGuideUserModel(this.repository.save(entity));
            guideUserModel.setCompanyIdList(model.getCompanyIdList());
            this.saveUserCompanyRel(guideUserModel);
            return guideUserModel;
        }
    }

    private void saveUserCompanyRel(GuideUserModel model) {
        if (CollectionUtils.isEmpty(model.getCompanyIdList()))
            return;

        List<UserCompanyRelEntity> relEntityList = new ArrayList<>();
        model.getCompanyIdList().forEach(companyId -> {
            UserCompanyRelEntity relEntity = new UserCompanyRelEntity();
            relEntity.setCompanyId(companyId);
            relEntity.setUserId(model.getId());
            relEntityList.add(relEntity);
        });
        userCompanyRelRepository.deleteByUserId(model.getId());
        userCompanyRelRepository.saveAll(relEntityList);
    }
}
