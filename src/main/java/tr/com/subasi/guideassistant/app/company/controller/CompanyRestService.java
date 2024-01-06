package tr.com.subasi.guideassistant.app.company.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.company.model.CompanyModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface CompanyRestService extends BaseRestService<CompanyModel, CompanySearchModel> {
}
