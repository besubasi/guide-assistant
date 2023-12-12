package tr.com.subasi.guideassistant.app.account.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.account.entity.AccountEntity;
import tr.com.subasi.guideassistant.app.account.mapper.AccountMapper;
import tr.com.subasi.guideassistant.app.account.model.AccountModel;
import tr.com.subasi.guideassistant.app.account.model.AccountSearchModel;
import tr.com.subasi.guideassistant.app.account.repository.AccountRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class AccountServiceImpl extends GenericServiceImpl<AccountModel, AccountSearchModel, AccountEntity> implements tr.com.subasi.guideassistant.app.account.service.AccountService {
    public AccountServiceImpl(AccountRepository repository, AccountMapper mapper) {
        super(repository, mapper);
    }
}
