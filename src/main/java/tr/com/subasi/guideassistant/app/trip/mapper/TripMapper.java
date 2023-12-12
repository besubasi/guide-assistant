package tr.com.subasi.guideassistant.app.trip.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.trip.entity.TripEntity;
import tr.com.subasi.guideassistant.app.trip.model.TripModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TripMapper extends BaseMapper<TripModel, TripEntity> {
}

