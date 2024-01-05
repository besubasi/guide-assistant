package tr.com.subasi.guideassistant.app.tourdescription.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourdescription.converter.TourDescriptionConverter;
import tr.com.subasi.guideassistant.app.tourdescription.entity.TourDescriptionEntity;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.tourdescription.repository.TourDescriptionRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TourDescriptionServiceImpl extends BaseServiceImpl<TourDescriptionModel, TourDescriptionSearchModel, TourDescriptionEntity, TourDescriptionRepository, TourDescriptionConverter> implements TourDescriptionService {
    public TourDescriptionServiceImpl(TourDescriptionRepository repository, TourDescriptionConverter converter) {
        super(repository, converter);
    }
}
