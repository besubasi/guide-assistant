package tr.com.subasi.guideassistant.app.paymenttype.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.paymenttype.entity.PaymentTypeEntity;
import tr.com.subasi.guideassistant.app.paymenttype.mapper.PaymentTypeMapper;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeModel;
import tr.com.subasi.guideassistant.app.paymenttype.model.PaymentTypeSearchModel;
import tr.com.subasi.guideassistant.app.paymenttype.repository.PaymentTypeRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class PaymentTypeServiceImpl extends GenericServiceImpl<PaymentTypeModel, PaymentTypeSearchModel, PaymentTypeEntity> implements tr.com.subasi.guideassistant.app.paymenttype.service.PaymentTypeService {
    public PaymentTypeServiceImpl(PaymentTypeRepository repository, PaymentTypeMapper mapper) {
        super(repository, mapper);
    }
}
