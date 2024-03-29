package tr.com.subasi.guideassistant.app.accounttransaction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionModel;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionSearchModel;
import tr.com.subasi.guideassistant.app.accounttransaction.service.AccountTransactionService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.accounttransaction.constant.AccountTransactionConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class AccountTransactionRestController extends BaseRestController<AccountTransactionService, AccountTransactionModel, AccountTransactionSearchModel> implements AccountTransactionRestService {

    public AccountTransactionRestController(AccountTransactionService service) {
        super(service);
    }
}
