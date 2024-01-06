package tr.com.subasi.guideassistant.app.tourdescription.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourdescription.entity.TourDescriptionEntity;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourDescriptionConverter extends BaseConverter<TourDescriptionModel, TourDescriptionEntity> {
}

