package tr.com.subasi.guideassistant.app.pricingtype.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.pricingtype.converter.PricingTypeConverter;
import tr.com.subasi.guideassistant.app.pricingtype.entity.PricingTypeEntity;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeModel;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeSearchModel;
import tr.com.subasi.guideassistant.app.pricingtype.repository.PricingTypeRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class PricingTypeServiceImpl extends BaseServiceImpl<PricingTypeModel, PricingTypeSearchModel, PricingTypeEntity, PricingTypeRepository, PricingTypeConverter> implements PricingTypeService {
    public PricingTypeServiceImpl(PricingTypeRepository repository, PricingTypeConverter converter) {
        super(repository, converter);
    }
}
