package tr.com.subasi.guideassistant.app.tourgallery.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourgallery.entity.TourGalleryEntity;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourGalleryConverter extends BaseConverter<TourGalleryModel, TourGalleryEntity> {

}