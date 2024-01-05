package tr.com.subasi.guideassistant.app.language.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.language.converter.LanguageConverter;
import tr.com.subasi.guideassistant.app.language.entity.LanguageEntity;
import tr.com.subasi.guideassistant.app.language.model.LanguageModel;
import tr.com.subasi.guideassistant.app.language.model.LanguageSearchModel;
import tr.com.subasi.guideassistant.app.language.repository.LanguageRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class LanguageServiceImpl extends BaseServiceImpl<LanguageModel, LanguageSearchModel, LanguageEntity, LanguageRepository, LanguageConverter> implements LanguageService {
    public LanguageServiceImpl(LanguageRepository repository, LanguageConverter converter) {
        super(repository, converter);
    }
}
