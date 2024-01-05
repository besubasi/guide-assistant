package tr.com.subasi.guideassistant.app.usercompanyrel.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.usercompanyrel.converter.UserCompanyRelConverter;
import tr.com.subasi.guideassistant.app.usercompanyrel.entity.UserCompanyRelEntity;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelModel;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.usercompanyrel.repository.UserCompanyRelRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class UserCompanyRelServiceImpl extends BaseServiceImpl<UserCompanyRelModel, UserCompanyRelSearchModel, UserCompanyRelEntity, UserCompanyRelRepository, UserCompanyRelConverter> implements UserCompanyRelService {
    public UserCompanyRelServiceImpl(UserCompanyRelRepository repository, UserCompanyRelConverter converter) {
        super(repository, converter);
    }
}