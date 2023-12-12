package tr.com.subasi.guideassistant.app.tripcustomer.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tripcustomer.entity.TripCustomerEntity;
import tr.com.subasi.guideassistant.app.tripcustomer.mapper.TripCustomerMapper;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerModel;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerSearchModel;
import tr.com.subasi.guideassistant.app.tripcustomer.repository.TripCustomerRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TripCustomerServiceImpl extends GenericServiceImpl<TripCustomerModel, TripCustomerSearchModel, TripCustomerEntity> implements tr.com.subasi.guideassistant.app.tripcustomer.service.TripCustomerService {
    public TripCustomerServiceImpl(TripCustomerRepository repository, TripCustomerMapper mapper) {
        super(repository, mapper);
    }
}
