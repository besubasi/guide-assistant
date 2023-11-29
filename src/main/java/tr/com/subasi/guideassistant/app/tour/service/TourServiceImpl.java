package tr.com.subasi.guideassistant.app.tour.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.mapper.TourMapper;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TourServiceImpl extends GenericServiceImpl<TourModel, TourSearchModel, TourEntity> implements tr.com.subasi.guideassistant.app.tour.service.TourService {
    public TourServiceImpl(TourRepository repository, TourMapper mapper) {
        super(repository, mapper);
    }
}
