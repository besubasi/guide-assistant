package tr.com.subasi.guideassistant.app.sales.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.sales.entity.SalesEntity;
import tr.com.subasi.guideassistant.app.sales.mapper.SalesMapper;
import tr.com.subasi.guideassistant.app.sales.model.SalesModel;
import tr.com.subasi.guideassistant.app.sales.model.SalesSearchModel;
import tr.com.subasi.guideassistant.app.sales.repository.SalesRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class SalesServiceImpl extends GenericServiceImpl<SalesModel, SalesSearchModel, SalesEntity> implements tr.com.subasi.guideassistant.app.sales.service.SalesService {
    public SalesServiceImpl(SalesRepository repository, SalesMapper mapper) {
        super(repository, mapper);
    }
}
