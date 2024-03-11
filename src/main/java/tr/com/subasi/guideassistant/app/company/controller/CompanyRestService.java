package tr.com.subasi.guideassistant.app.company.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.company.model.CompanyModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySaveModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;
import tr.com.subasi.guideassistant.common.controller.BaseRestService2;

@Validated
public interface CompanyRestService extends BaseRestService2<CompanySaveModel, CompanyModel, CompanySearchModel> {
}
