package tr.com.subasi.guideassistant.app.tourdaydescription.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourdaydescription.entity.TourDayDescriptionEntity;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourDayDescriptionMapper extends BaseMapper<TourDayDescriptionModel, TourDayDescriptionEntity> {
}

