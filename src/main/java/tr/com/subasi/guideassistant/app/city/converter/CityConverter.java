package tr.com.subasi.guideassistant.app.city.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.city.model.CityModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CityConverter extends BaseMapper<CityModel, CityEntity> {
}

