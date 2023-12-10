package tr.com.subasi.guideassistant.app.language.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.language.entity.LanguageEntity;
import tr.com.subasi.guideassistant.app.language.mapper.LanguageMapper;
import tr.com.subasi.guideassistant.app.language.model.LanguageModel;
import tr.com.subasi.guideassistant.app.language.model.LanguageSearchModel;
import tr.com.subasi.guideassistant.app.language.repository.LanguageRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class LanguageServiceImpl extends GenericServiceImpl<LanguageModel, LanguageSearchModel, LanguageEntity> implements tr.com.subasi.guideassistant.app.language.service.LanguageService {
    public LanguageServiceImpl(LanguageRepository repository, LanguageMapper mapper) {
        super(repository, mapper);
    }
}
