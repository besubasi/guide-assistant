package tr.com.subasi.guideassistant.app.tripactivity.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tripactivity.converter.TripActivityConverter;
import tr.com.subasi.guideassistant.app.tripactivity.entity.TripActivityEntity;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivityModel;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivitySearchModel;
import tr.com.subasi.guideassistant.app.tripactivity.repository.TripActivityRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TripActivityServiceImpl extends BaseServiceImpl<TripActivityModel, TripActivitySearchModel, TripActivityEntity, TripActivityRepository, TripActivityConverter> implements TripActivityService {
    public TripActivityServiceImpl(TripActivityRepository repository, TripActivityConverter converter) {
        super(repository, converter);
    }
}
