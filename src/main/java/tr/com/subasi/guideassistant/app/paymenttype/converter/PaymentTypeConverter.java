package tr.com.subasi.guideassistant.app.paymenttype.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.paymenttype.entity.PaymentTypeEntity;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentTypeConverter extends BaseConverter<PaymentTypeModel, PaymentTypeEntity> {
}

