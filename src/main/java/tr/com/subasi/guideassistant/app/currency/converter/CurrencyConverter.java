package tr.com.subasi.guideassistant.app.currency.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.currency.entity.CurrencyEntity;
import tr.com.subasi.guideassistant.app.currency.model.CurrencyModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CurrencyConverter extends BaseMapper<CurrencyModel, CurrencyEntity> {
}

