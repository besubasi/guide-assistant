package tr.com.subasi.guideassistant.app.pricingtype.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.pricingtype.entity.PricingTypeEntity;
import tr.com.subasi.guideassistant.app.pricingtype.mapper.PricingTypeMapper;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeModel;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeSearchModel;
import tr.com.subasi.guideassistant.app.pricingtype.repository.PricingTypeRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class PricingTypeServiceImpl extends GenericServiceImpl<PricingTypeModel, PricingTypeSearchModel, PricingTypeEntity> implements tr.com.subasi.guideassistant.app.pricingtype.service.PricingTypeService {
    public PricingTypeServiceImpl(PricingTypeRepository repository, PricingTypeMapper mapper) {
        super(repository, mapper);
    }
}
