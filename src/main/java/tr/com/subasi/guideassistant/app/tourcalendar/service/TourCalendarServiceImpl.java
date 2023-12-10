package tr.com.subasi.guideassistant.app.tourcalendar.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourcalendar.entity.TourCalendarEntity;
import tr.com.subasi.guideassistant.app.tourcalendar.mapper.TourCalendarMapper;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarSearchModel;
import tr.com.subasi.guideassistant.app.tourcalendar.repository.TourCalendarRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TourCalendarServiceImpl extends GenericServiceImpl<TourCalendarModel, TourCalendarSearchModel, TourCalendarEntity> implements tr.com.subasi.guideassistant.app.tourcalendar.service.TourCalendarService {
    public TourCalendarServiceImpl(TourCalendarRepository repository, TourCalendarMapper mapper) {
        super(repository, mapper);
    }
}
