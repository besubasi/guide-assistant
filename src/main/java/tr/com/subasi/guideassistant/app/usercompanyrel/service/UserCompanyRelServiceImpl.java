package tr.com.subasi.guideassistant.app.usercompanyrel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.usercompanyrel.entity.UserCompanyRelEntity;
import tr.com.subasi.guideassistant.app.usercompanyrel.mapper.UserCompanyRelMapper;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelModel;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.usercompanyrel.repository.UserCompanyRelRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class UserCompanyRelServiceImpl extends GenericServiceImpl<UserCompanyRelModel, UserCompanyRelSearchModel, UserCompanyRelEntity> implements tr.com.subasi.guideassistant.app.usercompanyrel.service.UserCompanyRelService {
    public UserCompanyRelServiceImpl(UserCompanyRelRepository repository, UserCompanyRelMapper mapper) {
        super(repository, mapper);
    }
}