package tr.com.subasi.guideassistant.app.tripactivitypricing.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tripactivitypricing.entity.TripActivityPricingEntity;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TripActivityPricingConverter extends BaseConverter<TripActivityPricingModel, TripActivityPricingEntity> {
}

