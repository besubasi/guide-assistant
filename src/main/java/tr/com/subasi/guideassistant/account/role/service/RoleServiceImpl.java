package tr.com.subasi.guideassistant.account.role.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.account.role.entity.RoleEntity;
import tr.com.subasi.guideassistant.account.role.mapper.RoleMapper;
import tr.com.subasi.guideassistant.account.role.model.RoleModel;
import tr.com.subasi.guideassistant.account.role.model.RoleSearchModel;
import tr.com.subasi.guideassistant.account.role.repository.RoleRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class RoleServiceImpl extends GenericServiceImpl<RoleModel, RoleSearchModel, RoleEntity> implements RoleService {
    public RoleServiceImpl(RoleRepository repository, RoleMapper mapper) {
        super(repository, mapper);
    }
}