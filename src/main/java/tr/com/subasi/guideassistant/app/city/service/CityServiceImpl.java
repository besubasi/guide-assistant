package tr.com.subasi.guideassistant.app.city.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.city.converter.CityConverter;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.city.model.CityModel;
import tr.com.subasi.guideassistant.app.city.model.CitySearchModel;
import tr.com.subasi.guideassistant.app.city.repository.CityRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class CityServiceImpl extends BaseServiceImpl<CityModel, CitySearchModel, CityEntity, CityRepository, CityConverter> implements CityService {
    public CityServiceImpl(CityRepository repository, CityConverter converter) {
        super(repository, converter);
    }
}
