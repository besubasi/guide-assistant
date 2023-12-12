package tr.com.subasi.guideassistant.app.accounttransaction.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.accounttransaction.entity.AccountTransactionEntity;
import tr.com.subasi.guideassistant.app.accounttransaction.mapper.AccountTransactionMapper;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionModel;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionSearchModel;
import tr.com.subasi.guideassistant.app.accounttransaction.repository.AccountTransactionRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class AccountTransactionServiceImpl extends GenericServiceImpl<AccountTransactionModel, AccountTransactionSearchModel, AccountTransactionEntity> implements tr.com.subasi.guideassistant.app.accounttransaction.service.AccountTransactionService {
    public AccountTransactionServiceImpl(AccountTransactionRepository repository, AccountTransactionMapper mapper) {
        super(repository, mapper);
    }
}
