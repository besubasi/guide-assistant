package tr.com.subasi.guideassistant.app.country.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.country.mapper.CountryMapper;
import tr.com.subasi.guideassistant.app.country.model.CountryModel;
import tr.com.subasi.guideassistant.app.country.model.CountrySearchModel;
import tr.com.subasi.guideassistant.app.country.repository.CountryRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class CountryServiceImpl extends GenericServiceImpl<CountryModel, CountrySearchModel, CountryEntity> implements tr.com.subasi.guideassistant.app.country.service.CountryService {
    public CountryServiceImpl(CountryRepository repository, CountryMapper mapper) {
        super(repository, mapper);
    }
}
