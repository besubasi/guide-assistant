package tr.com.subasi.guideassistant.app.tourcategory.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategoryModel;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySaveModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter2;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourCategoryConverter extends BaseConverter2<TourCategorySaveModel, TourCategoryModel, TourCategoryEntity> {
}

