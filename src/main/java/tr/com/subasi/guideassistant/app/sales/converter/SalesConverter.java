package tr.com.subasi.guideassistant.app.sales.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.sales.entity.SalesEntity;
import tr.com.subasi.guideassistant.app.sales.model.SalesModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SalesConverter extends BaseConverter<SalesModel, SalesEntity> {
}

