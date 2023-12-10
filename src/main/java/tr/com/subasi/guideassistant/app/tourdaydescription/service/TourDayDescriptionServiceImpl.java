package tr.com.subasi.guideassistant.app.tourdaydescription.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourdaydescription.entity.TourDayDescriptionEntity;
import tr.com.subasi.guideassistant.app.tourdaydescription.mapper.TourDayDescriptionMapper;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.repository.TourDayDescriptionRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TourDayDescriptionServiceImpl extends GenericServiceImpl<TourDayDescriptionModel, TourDayDescriptionSearchModel, TourDayDescriptionEntity> implements tr.com.subasi.guideassistant.app.tourdaydescription.service.TourDayDescriptionService {
    public TourDayDescriptionServiceImpl(TourDayDescriptionRepository repository, TourDayDescriptionMapper mapper) {
        super(repository, mapper);
    }
}
