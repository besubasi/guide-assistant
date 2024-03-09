package tr.com.subasi.guideassistant.app.tourdaydescription.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourdaydescription.converter.TourDayDescriptionConverter;
import tr.com.subasi.guideassistant.app.tourdaydescription.entity.TourDayDescriptionEntity;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionSearchModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.repository.TourDayDescriptionRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

import java.util.List;

@Service
public class TourDayDescriptionServiceImpl extends BaseServiceImpl<TourDayDescriptionModel, TourDayDescriptionSearchModel, TourDayDescriptionEntity, TourDayDescriptionRepository, TourDayDescriptionConverter> implements TourDayDescriptionService {
    public TourDayDescriptionServiceImpl(TourDayDescriptionRepository repository, TourDayDescriptionConverter converter) {
        super(repository, converter);
    }

    @Override
    public List<TourDayDescriptionModel> getListByTourId(Long tourId) {
        return converter.convertToModelList(repository.findAllByTourIdOrderByDayNumber(tourId));
    }

}
