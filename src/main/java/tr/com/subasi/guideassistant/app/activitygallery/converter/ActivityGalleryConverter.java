package tr.com.subasi.guideassistant.app.activitygallery.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGalleryModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ActivityGalleryConverter extends BaseConverter<ActivityGalleryModel, ActivityGalleryEntity> {

}