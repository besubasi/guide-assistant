package tr.com.subasi.guideassistant.app.tourcalendar.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourcalendar.entity.TourCalendarEntity;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourCalendarMapper extends BaseMapper<TourCalendarModel, TourCalendarEntity> {
}

