package tr.com.subasi.guideassistant.app.pricingtype.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.pricingtype.entity.PricingTypeEntity;
import tr.com.subasi.guideassistant.app.pricingtype.model.PricingTypeModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PricingTypeConverter extends BaseMapper<PricingTypeModel, PricingTypeEntity> {
}

