package tr.com.subasi.guideassistant.app.exchange.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.exchange.entity.ExchangeEntity;
import tr.com.subasi.guideassistant.app.exchange.model.ExchangeModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ExchangeMapper extends BaseMapper<ExchangeModel, ExchangeEntity> {
}

