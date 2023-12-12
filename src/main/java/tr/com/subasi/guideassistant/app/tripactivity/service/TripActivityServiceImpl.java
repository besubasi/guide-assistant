package tr.com.subasi.guideassistant.app.tripactivity.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tripactivity.entity.TripActivityEntity;
import tr.com.subasi.guideassistant.app.tripactivity.mapper.TripActivityMapper;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivityModel;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivitySearchModel;
import tr.com.subasi.guideassistant.app.tripactivity.repository.TripActivityRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TripActivityServiceImpl extends GenericServiceImpl<TripActivityModel, TripActivitySearchModel, TripActivityEntity> implements tr.com.subasi.guideassistant.app.tripactivity.service.TripActivityService {
    public TripActivityServiceImpl(TripActivityRepository repository, TripActivityMapper mapper) {
        super(repository, mapper);
    }
}
