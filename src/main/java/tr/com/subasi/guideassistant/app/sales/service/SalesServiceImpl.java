package tr.com.subasi.guideassistant.app.sales.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.sales.converter.SalesConverter;
import tr.com.subasi.guideassistant.app.sales.entity.SalesEntity;
import tr.com.subasi.guideassistant.app.sales.model.SalesModel;
import tr.com.subasi.guideassistant.app.sales.model.SalesSearchModel;
import tr.com.subasi.guideassistant.app.sales.repository.SalesRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class SalesServiceImpl extends BaseServiceImpl<SalesModel, SalesSearchModel, SalesEntity, SalesRepository, SalesConverter> implements SalesService {
    public SalesServiceImpl(SalesRepository repository, SalesConverter converter) {
        super(repository, converter);
    }
}
