package tr.com.subasi.guideassistant.app.tripactivitypricing.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tripactivitypricing.entity.TripActivityPricingEntity;
import tr.com.subasi.guideassistant.app.tripactivitypricing.mapper.TripActivityPricingMapper;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingModel;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingSearchModel;
import tr.com.subasi.guideassistant.app.tripactivitypricing.repository.TripActivityPricingRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TripActivityPricingServiceImpl extends GenericServiceImpl<TripActivityPricingModel, TripActivityPricingSearchModel, TripActivityPricingEntity> implements tr.com.subasi.guideassistant.app.tripactivitypricing.service.TripActivityPricingService {
    public TripActivityPricingServiceImpl(TripActivityPricingRepository repository, TripActivityPricingMapper mapper) {
        super(repository, mapper);
    }
}
