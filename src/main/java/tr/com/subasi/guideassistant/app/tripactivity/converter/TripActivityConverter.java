package tr.com.subasi.guideassistant.app.tripactivity.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tripactivity.entity.TripActivityEntity;
import tr.com.subasi.guideassistant.app.tripactivity.model.TripActivityModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TripActivityConverter extends BaseMapper<TripActivityModel, TripActivityEntity> {
}

