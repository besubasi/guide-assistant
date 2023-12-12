package tr.com.subasi.guideassistant.app.trip.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.trip.entity.TripEntity;
import tr.com.subasi.guideassistant.app.trip.mapper.TripMapper;
import tr.com.subasi.guideassistant.app.trip.model.TripModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSearchModel;
import tr.com.subasi.guideassistant.app.trip.repository.TripRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TripServiceImpl extends GenericServiceImpl<TripModel, TripSearchModel, TripEntity> implements tr.com.subasi.guideassistant.app.trip.service.TripService {
    public TripServiceImpl(TripRepository repository, TripMapper mapper) {
        super(repository, mapper);
    }
}
