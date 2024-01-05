package tr.com.subasi.guideassistant.app.trip.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.trip.converter.TripConverter;
import tr.com.subasi.guideassistant.app.trip.entity.TripEntity;
import tr.com.subasi.guideassistant.app.trip.model.TripModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSearchModel;
import tr.com.subasi.guideassistant.app.trip.repository.TripRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TripServiceImpl extends BaseServiceImpl<TripModel, TripSearchModel, TripEntity, TripRepository, TripConverter> implements TripService {
    public TripServiceImpl(TripRepository repository, TripConverter converter) {
        super(repository, converter);
    }
}
