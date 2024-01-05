package tr.com.subasi.guideassistant.account.role.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.account.role.converter.RoleConverter;
import tr.com.subasi.guideassistant.account.role.entity.RoleEntity;
import tr.com.subasi.guideassistant.account.role.model.RoleModel;
import tr.com.subasi.guideassistant.account.role.model.RoleSearchModel;
import tr.com.subasi.guideassistant.account.role.repository.RoleRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleModel, RoleSearchModel, RoleEntity, RoleRepository, RoleConverter> implements RoleService {
    public RoleServiceImpl(RoleRepository repository, RoleConverter converter) {
        super(repository, converter);
    }
}