package tr.com.subasi.guideassistant.app.exchange.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.exchange.entity.ExchangeEntity;
import tr.com.subasi.guideassistant.app.exchange.mapper.ExchangeMapper;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeModel;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeSearchModel;
import tr.com.subasi.guideassistant.app.exchange.repository.ExchangeRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class ExchangeServiceImpl extends GenericServiceImpl<ExchangeModel, ExchangeSearchModel, ExchangeEntity> implements tr.com.subasi.guideassistant.app.exchange.service.ExchangeService {
    public ExchangeServiceImpl(ExchangeRepository repository, ExchangeMapper mapper) {
        super(repository, mapper);
    }
}
