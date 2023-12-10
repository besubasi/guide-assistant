package tr.com.subasi.guideassistant.app.tourdescription.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourdescription.entity.TourDescriptionEntity;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourDescriptionMapper extends BaseMapper<TourDescriptionModel, TourDescriptionEntity> {
}

