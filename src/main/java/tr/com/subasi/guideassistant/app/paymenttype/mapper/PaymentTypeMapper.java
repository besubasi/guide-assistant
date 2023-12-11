package tr.com.subasi.guideassistant.app.paymenttype.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.paymenttype.entity.PaymentTypeEntity;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentTypeMapper extends BaseMapper<PaymentTypeModel, PaymentTypeEntity> {
}

