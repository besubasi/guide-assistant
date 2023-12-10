package tr.com.subasi.guideassistant.app.tourdescription.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourdescription.entity.TourDescriptionEntity;
import tr.com.subasi.guideassistant.app.tourdescription.mapper.TourDescriptionMapper;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.tourdescription.repository.TourDescriptionRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TourDescriptionServiceImpl extends GenericServiceImpl<TourDescriptionModel, TourDescriptionSearchModel, TourDescriptionEntity> implements tr.com.subasi.guideassistant.app.tourdescription.service.TourDescriptionService {
    public TourDescriptionServiceImpl(TourDescriptionRepository repository, TourDescriptionMapper mapper) {
        super(repository, mapper);
    }
}
