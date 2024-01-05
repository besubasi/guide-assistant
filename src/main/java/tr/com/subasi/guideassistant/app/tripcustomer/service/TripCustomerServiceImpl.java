package tr.com.subasi.guideassistant.app.tripcustomer.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tripcustomer.converter.TripCustomerConverter;
import tr.com.subasi.guideassistant.app.tripcustomer.entity.TripCustomerEntity;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerModel;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerSearchModel;
import tr.com.subasi.guideassistant.app.tripcustomer.repository.TripCustomerRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TripCustomerServiceImpl extends BaseServiceImpl<TripCustomerModel, TripCustomerSearchModel, TripCustomerEntity, TripCustomerRepository, TripCustomerConverter> implements TripCustomerService {
    public TripCustomerServiceImpl(TripCustomerRepository repository, TripCustomerConverter converter) {
         super(repository, converter);
    }
}
