package tr.com.subasi.guideassistant.app.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.account.model.AccountModel;
import tr.com.subasi.guideassistant.app.account.model.AccountSearchModel;
import tr.com.subasi.guideassistant.app.account.service.AccountService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.account.constant.AccountConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class AccountRestController extends GenericRestController<AccountModel, AccountSearchModel> {

    public AccountRestController(AccountService service) {
        super(service);
    }
}
