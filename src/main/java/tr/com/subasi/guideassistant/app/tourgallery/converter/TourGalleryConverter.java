package tr.com.subasi.guideassistant.app.tourgallery.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourgallery.entity.TourGalleryEntity;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourGalleryConverter extends BaseConverter<TourGalleryModel, TourGalleryEntity> {

    List<TourGalleryModel> convertToModelList(List<TourGalleryEntity> entityList);

    TourGalleryModel convertToModel(TourGalleryEntity entity);

}