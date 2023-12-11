package tr.com.subasi.guideassistant.app.currency.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.currency.entity.CurrencyEntity;
import tr.com.subasi.guideassistant.app.currency.mapper.CurrencyMapper;
import tr.com.subasi.guideassistant.app.currency.model.CurrencyModel;
import tr.com.subasi.guideassistant.app.currency.model.CurrencySearchModel;
import tr.com.subasi.guideassistant.app.currency.repository.CurrencyRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class CurrencyServiceImpl extends GenericServiceImpl<CurrencyModel, CurrencySearchModel, CurrencyEntity> implements tr.com.subasi.guideassistant.app.currency.service.CurrencyService {
    public CurrencyServiceImpl(CurrencyRepository repository, CurrencyMapper mapper) {
        super(repository, mapper);
    }
}
