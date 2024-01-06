package tr.com.subasi.guideassistant.app.account.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.account.model.AccountModel;
import tr.com.subasi.guideassistant.app.account.model.AccountSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface AccountRestService extends BaseRestService<AccountModel, AccountSearchModel> {
}
