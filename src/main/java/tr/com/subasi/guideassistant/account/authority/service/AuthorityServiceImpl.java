package tr.com.subasi.guideassistant.account.authority.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.account.authority.converter.AuthorityConverter;
import tr.com.subasi.guideassistant.account.authority.entity.AuthorityEntity;
import tr.com.subasi.guideassistant.account.authority.model.AuthorityModel;
import tr.com.subasi.guideassistant.account.authority.model.AuthoritySearchModel;
import tr.com.subasi.guideassistant.account.authority.repository.AuthorityRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class AuthorityServiceImpl extends BaseServiceImpl<AuthorityModel, AuthoritySearchModel, AuthorityEntity, AuthorityRepository, AuthorityConverter> implements AuthorityService {
    public AuthorityServiceImpl(AuthorityRepository repository, AuthorityConverter converter) {
        super(repository, converter);
    }
}