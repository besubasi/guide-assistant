package tr.com.subasi.guideassistant.app.city.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.city.model.CityModel;
import tr.com.subasi.guideassistant.app.city.model.CitySaveModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter2;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CityConverter extends BaseConverter2<CitySaveModel, CityModel, CityEntity> {
}

