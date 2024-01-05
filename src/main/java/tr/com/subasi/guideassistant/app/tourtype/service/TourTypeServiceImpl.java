package tr.com.subasi.guideassistant.app.tourtype.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourtype.converter.TourTypeConverter;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeModel;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeSearchModel;
import tr.com.subasi.guideassistant.app.tourtype.repository.TourTypeRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TourTypeServiceImpl extends BaseServiceImpl<TourTypeModel, TourTypeSearchModel, TourTypeEntity, TourTypeRepository, TourTypeConverter> implements TourTypeService {
    public TourTypeServiceImpl(TourTypeRepository repository, TourTypeConverter converter) {
        super(repository, converter);
    }
}
