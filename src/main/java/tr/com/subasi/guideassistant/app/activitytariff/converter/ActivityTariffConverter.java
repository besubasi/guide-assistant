package tr.com.subasi.guideassistant.app.activitytariff.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.activitytariff.entity.ActivityTariffEntity;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ActivityTariffConverter extends BaseMapper<ActivityTariffModel, ActivityTariffEntity> {
}

