package tr.com.subasi.guideassistant.account.authority.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.account.authority.entity.AuthorityEntity;
import tr.com.subasi.guideassistant.account.authority.mapper.AuthorityMapper;
import tr.com.subasi.guideassistant.account.authority.model.AuthorityModel;
import tr.com.subasi.guideassistant.account.authority.model.AuthoritySearchModel;
import tr.com.subasi.guideassistant.account.authority.repository.AuthorityRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class AuthorityServiceImpl extends GenericServiceImpl<AuthorityModel, AuthoritySearchModel, AuthorityEntity> implements AuthorityService {
    public AuthorityServiceImpl(AuthorityRepository repository, AuthorityMapper mapper) {
        super(repository, mapper);
    }
}