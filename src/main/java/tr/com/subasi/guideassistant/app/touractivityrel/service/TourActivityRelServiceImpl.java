package tr.com.subasi.guideassistant.app.touractivityrel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.touractivityrel.converter.TourActivityRelConverter;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;
import tr.com.subasi.guideassistant.app.touractivityrel.repository.TourActivityRelRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TourActivityRelServiceImpl extends BaseServiceImpl<TourActivityRelModel, TourActivityRelSearchModel, TourActivityRelEntity, TourActivityRelRepository, TourActivityRelConverter> implements TourActivityRelService {
    public TourActivityRelServiceImpl(TourActivityRelRepository repository, TourActivityRelConverter converter) {
        super(repository, converter);
    }
}