package tr.com.subasi.guideassistant.app.currency.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.currency.converter.CurrencyConverter;
import tr.com.subasi.guideassistant.app.currency.entity.CurrencyEntity;
import tr.com.subasi.guideassistant.app.currency.model.CurrencyModel;
import tr.com.subasi.guideassistant.app.currency.model.CurrencySearchModel;
import tr.com.subasi.guideassistant.app.currency.repository.CurrencyRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class CurrencyServiceImpl extends BaseServiceImpl<CurrencyModel, CurrencySearchModel, CurrencyEntity, CurrencyRepository, CurrencyConverter> implements tr.com.subasi.guideassistant.app.currency.service.CurrencyService {
    public CurrencyServiceImpl(CurrencyRepository repository, CurrencyConverter converter) {
        super(repository, converter);
    }
}
