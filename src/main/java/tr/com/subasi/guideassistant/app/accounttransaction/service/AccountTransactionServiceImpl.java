package tr.com.subasi.guideassistant.app.accounttransaction.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.accounttransaction.converter.AccountTransactionConverter;
import tr.com.subasi.guideassistant.app.accounttransaction.entity.AccountTransactionEntity;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionModel;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionSearchModel;
import tr.com.subasi.guideassistant.app.accounttransaction.repository.AccountTransactionRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class AccountTransactionServiceImpl extends BaseServiceImpl<AccountTransactionModel, AccountTransactionSearchModel, AccountTransactionEntity, AccountTransactionRepository, AccountTransactionConverter> implements AccountTransactionService {
    public AccountTransactionServiceImpl(AccountTransactionRepository repository, AccountTransactionConverter converter) {
        super(repository, converter);
    }
}
