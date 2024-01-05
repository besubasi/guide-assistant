package tr.com.subasi.guideassistant.app.account.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.account.entity.AccountEntity;
import tr.com.subasi.guideassistant.app.account.converter.AccountConverter;
import tr.com.subasi.guideassistant.app.account.model.AccountModel;
import tr.com.subasi.guideassistant.app.account.model.AccountSearchModel;
import tr.com.subasi.guideassistant.app.account.repository.AccountRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class AccountServiceImpl extends BaseServiceImpl<AccountModel, AccountSearchModel, AccountEntity, AccountRepository, AccountConverter> implements tr.com.subasi.guideassistant.app.account.service.AccountService {
    public AccountServiceImpl(AccountRepository repository, AccountConverter converter) {
        super(repository, converter);
    }
}
