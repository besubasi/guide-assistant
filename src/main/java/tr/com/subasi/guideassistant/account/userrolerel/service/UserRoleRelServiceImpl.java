package tr.com.subasi.guideassistant.account.userrolerel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.account.userrolerel.converter.UserRoleRelConverter;
import tr.com.subasi.guideassistant.account.userrolerel.entity.UserRoleRelEntity;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelModel;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelSearchModel;
import tr.com.subasi.guideassistant.account.userrolerel.repository.UserRoleRelRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class UserRoleRelServiceImpl extends BaseServiceImpl<UserRoleRelModel, UserRoleRelSearchModel, UserRoleRelEntity, UserRoleRelRepository, UserRoleRelConverter> implements UserRoleRelService {
    public UserRoleRelServiceImpl(UserRoleRelRepository repository, UserRoleRelConverter converter) {
        super(repository, converter);
    }
}