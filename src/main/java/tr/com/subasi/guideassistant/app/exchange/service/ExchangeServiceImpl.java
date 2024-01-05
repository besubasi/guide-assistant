package tr.com.subasi.guideassistant.app.exchange.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.exchange.converter.ExchangeConverter;
import tr.com.subasi.guideassistant.app.exchange.entity.ExchangeEntity;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeModel;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeSearchModel;
import tr.com.subasi.guideassistant.app.exchange.repository.ExchangeRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class ExchangeServiceImpl extends BaseServiceImpl<ExchangeModel, ExchangeSearchModel, ExchangeEntity, ExchangeRepository, ExchangeConverter> implements ExchangeService {
    public ExchangeServiceImpl(ExchangeRepository repository, ExchangeConverter converter) {
        super(repository, converter);
    }
}
