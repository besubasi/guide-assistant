package tr.com.subasi.guideassistant.app.sales.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.sales.entity.SalesEntity;
import tr.com.subasi.guideassistant.app.sales.model.SalesModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SalesMapper extends BaseMapper<SalesModel, SalesEntity> {
}

