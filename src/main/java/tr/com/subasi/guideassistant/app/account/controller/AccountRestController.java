package tr.com.subasi.guideassistant.app.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.account.model.AccountModel;
import tr.com.subasi.guideassistant.app.account.model.AccountSearchModel;
import tr.com.subasi.guideassistant.app.account.service.AccountService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.account.constant.AccountConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class AccountRestController extends BaseRestController<AccountService, AccountModel, AccountSearchModel> implements AccountRestService {

    public AccountRestController(AccountService service) {
        super(service);
    }
}
