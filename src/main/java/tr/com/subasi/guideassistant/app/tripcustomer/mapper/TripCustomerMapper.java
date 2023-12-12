package tr.com.subasi.guideassistant.app.tripcustomer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tripcustomer.entity.TripCustomerEntity;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TripCustomerMapper extends BaseMapper<TripCustomerModel, TripCustomerEntity> {
}

