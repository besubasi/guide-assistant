package tr.com.subasi.guideassistant.app.touractivityrel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.mapper.TourActivityRelMapper;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;
import tr.com.subasi.guideassistant.app.touractivityrel.repository.TourActivityRelRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TourActivityRelServiceImpl extends GenericServiceImpl<TourActivityRelModel, TourActivityRelSearchModel, TourActivityRelEntity> implements tr.com.subasi.guideassistant.app.touractivityrel.service.TourActivityRelService {
    public TourActivityRelServiceImpl(TourActivityRelRepository repository, TourActivityRelMapper mapper) {
        super(repository, mapper);
    }
}