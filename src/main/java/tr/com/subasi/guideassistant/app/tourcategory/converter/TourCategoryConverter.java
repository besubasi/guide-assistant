package tr.com.subasi.guideassistant.app.tourcategory.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategoryModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourCategoryConverter extends BaseMapper<TourCategoryModel, TourCategoryEntity> {
}

