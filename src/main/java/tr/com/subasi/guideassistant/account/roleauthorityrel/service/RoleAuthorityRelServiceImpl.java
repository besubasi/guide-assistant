package tr.com.subasi.guideassistant.account.roleauthorityrel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.account.roleauthorityrel.entity.RoleAuthorityRelEntity;
import tr.com.subasi.guideassistant.account.roleauthorityrel.mapper.RoleAuthorityRelMapper;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelSearchModel;
import tr.com.subasi.guideassistant.account.roleauthorityrel.repository.RoleAuthorityRelRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class RoleAuthorityRelServiceImpl extends GenericServiceImpl<RoleAuthorityRelModel, RoleAuthorityRelSearchModel, RoleAuthorityRelEntity> implements tr.com.subasi.guideassistant.account.roleauthorityrel.service.RoleAuthorityRelService {
    public RoleAuthorityRelServiceImpl(RoleAuthorityRelRepository repository, RoleAuthorityRelMapper mapper) {
        super(repository, mapper);
    }
}