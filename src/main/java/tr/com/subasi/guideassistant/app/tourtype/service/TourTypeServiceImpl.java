package tr.com.subasi.guideassistant.app.tourtype.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;
import tr.com.subasi.guideassistant.app.tourtype.mapper.TourTypeMapper;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeModel;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeSearchModel;
import tr.com.subasi.guideassistant.app.tourtype.repository.TourTypeRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TourTypeServiceImpl extends GenericServiceImpl<TourTypeModel, TourTypeSearchModel, TourTypeEntity> implements tr.com.subasi.guideassistant.app.tourtype.service.TourTypeService {
    public TourTypeServiceImpl(TourTypeRepository repository, TourTypeMapper mapper) {
        super(repository, mapper);
    }
}
