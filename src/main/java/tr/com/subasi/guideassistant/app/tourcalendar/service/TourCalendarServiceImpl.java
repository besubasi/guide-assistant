package tr.com.subasi.guideassistant.app.tourcalendar.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourcalendar.converter.TourCalendarConverter;
import tr.com.subasi.guideassistant.app.tourcalendar.entity.TourCalendarEntity;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarBatchModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarModel;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarSearchModel;
import tr.com.subasi.guideassistant.app.tourcalendar.repository.TourCalendarRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourCalendarServiceImpl extends BaseServiceImpl<TourCalendarModel, TourCalendarSearchModel, TourCalendarEntity, TourCalendarRepository, TourCalendarConverter> implements TourCalendarService {
    public TourCalendarServiceImpl(TourCalendarRepository repository, TourCalendarConverter converter) {
        super(repository, converter);
    }

    @Override
    public Boolean saveBatch(TourCalendarBatchModel batchModel) {
        List<TourCalendarEntity> entityList = new ArrayList<>();
        batchModel.getStartDateList().forEach(startDate -> {
            TourCalendarEntity entity = new TourCalendarEntity();
            entity.setTourId(batchModel.getTourId());
            entity.setStartDate(startDate);
            entityList.add(entity);
        });
        repository.saveAll(entityList);
        return Boolean.TRUE;
    }
}
