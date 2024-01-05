package tr.com.subasi.guideassistant.account.roleauthorityrel.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.account.roleauthorityrel.converter.RoleAuthorityRelConverter;
import tr.com.subasi.guideassistant.account.roleauthorityrel.entity.RoleAuthorityRelEntity;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelSearchModel;
import tr.com.subasi.guideassistant.account.roleauthorityrel.repository.RoleAuthorityRelRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class RoleAuthorityRelServiceImpl extends BaseServiceImpl<RoleAuthorityRelModel, RoleAuthorityRelSearchModel, RoleAuthorityRelEntity, RoleAuthorityRelRepository, RoleAuthorityRelConverter> implements RoleAuthorityRelService {
    public RoleAuthorityRelServiceImpl(RoleAuthorityRelRepository repository, RoleAuthorityRelConverter converter) {
        super(repository, converter);
    }
}