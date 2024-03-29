package tr.com.subasi.guideassistant.app.country.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.country.model.CountryModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryConverter extends BaseConverter<CountryModel, CountryEntity> {
}

