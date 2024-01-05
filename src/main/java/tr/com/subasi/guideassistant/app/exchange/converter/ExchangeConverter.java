package tr.com.subasi.guideassistant.app.exchange.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.exchange.entity.ExchangeEntity;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ExchangeConverter extends BaseMapper<ExchangeModel, ExchangeEntity> {
}

