package tr.com.subasi.guideassistant.app.language.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.language.model.LanguageModel;
import tr.com.subasi.guideassistant.app.language.model.LanguageSearchModel;
import tr.com.subasi.guideassistant.app.language.service.LanguageService;
import tr.com.subasi.guideassistant.common.controller.GenericRestController;

import static tr.com.subasi.guideassistant.app.language.constant.LanguageConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class LanguageRestController extends GenericRestController<LanguageModel, LanguageSearchModel> {

    public LanguageRestController(LanguageService service) {
        super(service);
    }
}
