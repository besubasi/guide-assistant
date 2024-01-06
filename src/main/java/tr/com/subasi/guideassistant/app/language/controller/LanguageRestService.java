package tr.com.subasi.guideassistant.app.language.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.language.model.LanguageModel;
import tr.com.subasi.guideassistant.app.language.model.LanguageSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface LanguageRestService extends BaseRestService<LanguageModel, LanguageSearchModel> {

}