package tr.com.subasi.guideassistant.app.tourtype.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourTypeConverter extends BaseMapper<TourTypeModel, TourTypeEntity> {
}

