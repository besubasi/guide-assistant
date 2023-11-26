package tr.com.subasi.guideassistant.account.userrolerel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.account.userrolerel.entity.UserRoleRelEntity;
import tr.com.subasi.guideassistant.account.userrolerel.mapper.UserRoleRelMapper;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelModel;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelSearchModel;
import tr.com.subasi.guideassistant.account.userrolerel.repository.UserRoleRelRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class UserRoleRelServiceImpl extends GenericServiceImpl<UserRoleRelModel, UserRoleRelSearchModel, UserRoleRelEntity> implements tr.com.subasi.guideassistant.account.userrolerel.service.UserRoleRelService {
    public UserRoleRelServiceImpl(UserRoleRelRepository repository, UserRoleRelMapper mapper) {
        super(repository, mapper);
    }
}