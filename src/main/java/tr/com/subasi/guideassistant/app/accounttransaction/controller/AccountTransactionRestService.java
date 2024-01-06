package tr.com.subasi.guideassistant.app.accounttransaction.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionModel;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface AccountTransactionRestService extends BaseRestService<AccountTransactionModel, AccountTransactionSearchModel> {
}
