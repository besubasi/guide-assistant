package tr.com.subasi.guideassistant.app.tripactivitypricing.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tripactivitypricing.converter.TripActivityPricingConverter;
import tr.com.subasi.guideassistant.app.tripactivitypricing.entity.TripActivityPricingEntity;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingModel;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingSearchModel;
import tr.com.subasi.guideassistant.app.tripactivitypricing.repository.TripActivityPricingRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TripActivityPricingServiceImpl extends BaseServiceImpl<TripActivityPricingModel, TripActivityPricingSearchModel, TripActivityPricingEntity, TripActivityPricingRepository, TripActivityPricingConverter> implements TripActivityPricingService {
    public TripActivityPricingServiceImpl(TripActivityPricingRepository repository, TripActivityPricingConverter converter) {
        super(repository, converter);
    }
}
