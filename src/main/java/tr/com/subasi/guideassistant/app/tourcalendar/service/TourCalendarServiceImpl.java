package tr.com.subasi.guideassistant.app.tourcalendar.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourcalendar.converter.TourCalendarConverter;
import tr.com.subasi.guideassistant.app.tourcalendar.entity.TourCalendarEntity;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarSearchModel;
import tr.com.subasi.guideassistant.app.tourcalendar.repository.TourCalendarRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TourCalendarServiceImpl extends BaseServiceImpl<TourCalendarModel, TourCalendarSearchModel, TourCalendarEntity, TourCalendarRepository, TourCalendarConverter> implements TourCalendarService {
    public TourCalendarServiceImpl(TourCalendarRepository repository, TourCalendarConverter converter) {
         super(repository, converter);
    }
}
