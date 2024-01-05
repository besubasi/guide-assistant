package tr.com.subasi.guideassistant.app.country.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.country.converter.CountryConverter;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.country.model.CountryModel;
import tr.com.subasi.guideassistant.app.country.model.CountrySearchModel;
import tr.com.subasi.guideassistant.app.country.repository.CountryRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class CountryServiceImpl extends BaseServiceImpl<CountryModel, CountrySearchModel, CountryEntity, CountryRepository, CountryConverter> implements CountryService {
    public CountryServiceImpl(CountryRepository repository, CountryConverter converter) {
         super(repository, converter);
    }
}
