package tr.com.subasi.guideassistant.app.country.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.country.converter.CountryConverter;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.country.model.CountryModel;
import tr.com.subasi.guideassistant.app.country.model.CountrySearchModel;
import tr.com.subasi.guideassistant.app.country.repository.CountryRepository;
import tr.com.subasi.guideassistant.app.country.repository.CountryRepositoryImpl;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

import java.util.List;

@Service
public class CountryServiceImpl extends BaseServiceImpl<CountryModel, CountrySearchModel, CountryEntity, CountryRepository, CountryConverter> implements CountryService {
    public CountryServiceImpl(CountryRepositoryImpl repository, CountryConverter converter) {
        super(repository, converter);
    }

    @Override
    public List<LookupModel> getLookupList(CountrySearchModel searchModel) {
        List<CountryEntity> entityList = repository.getList(searchModel);
        return converter.convertToLookupModelList(entityList);
    }

    @Override
    public List<CountryModel> getList(CountrySearchModel searchModel) {
        List<CountryEntity> entityList = repository.getList(searchModel);
        return converter.convertToModelList(entityList);
    }

    @Override
    public Page<CountryModel> getPage(CountrySearchModel searchModel) {
        Page<CountryEntity> page = repository.getPage(searchModel);
        return new Page<>(converter.convertToModelList(page.getData()), page.getTotalElements(), page.getTotalPages(), searchModel.getPageable());
    }
}
