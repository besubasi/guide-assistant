package tr.com.subasi.guideassistant.app.tripactivitypricing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tripactivitypricing.entity.TripActivityPricingEntity;
import tr.com.subasi.guideassistant.app.tripactivitypricing.model.TripActivityPricingModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TripActivityPricingMapper extends BaseMapper<TripActivityPricingModel, TripActivityPricingEntity> {
}

