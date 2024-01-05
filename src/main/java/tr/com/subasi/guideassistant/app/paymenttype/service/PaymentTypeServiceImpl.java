package tr.com.subasi.guideassistant.app.paymenttype.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.paymenttype.converter.PaymentTypeConverter;
import tr.com.subasi.guideassistant.app.paymenttype.entity.PaymentTypeEntity;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeModel;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeSearchModel;
import tr.com.subasi.guideassistant.app.paymenttype.repository.PaymentTypeRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class PaymentTypeServiceImpl extends BaseServiceImpl<PaymentTypeModel, PaymentTypeSearchModel, PaymentTypeEntity, PaymentTypeRepository, PaymentTypeConverter> implements PaymentTypeService {
    public PaymentTypeServiceImpl(PaymentTypeRepository repository, PaymentTypeConverter converter) {
        super(repository, converter);
    }
}
