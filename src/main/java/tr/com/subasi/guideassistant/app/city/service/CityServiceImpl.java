package tr.com.subasi.guideassistant.app.city.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.city.converter.CityConverter;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.city.model.CityModel;
import tr.com.subasi.guideassistant.app.city.model.CitySaveModel;
import tr.com.subasi.guideassistant.app.city.model.CitySearchModel;
import tr.com.subasi.guideassistant.app.city.repository.CityRepository;
import tr.com.subasi.guideassistant.app.city.repository.CityRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl extends BaseServiceImpl2<CitySaveModel, CityModel, CitySearchModel, CityEntity, CityRepository, CityConverter> implements CityService {
    public CityServiceImpl(CityRepositoryImpl repository, CityConverter converter) {
        super(repository, converter);
    }

    @Override
    public List<CityModel> getList(CitySearchModel searchModel) {
        List<Tuple> tupleList = repository.getList(searchModel);
        return this.convertToModel(tupleList);
    }

    private List<CityModel> convertToModel(List<Tuple> tupleList) {
        List<CityModel> tourCategoryModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                tourCategoryModelList.add(this.convertToModel(tuple))
        );
        return tourCategoryModelList;
    }

    private CityModel convertToModel(Tuple tuple) {
        CityEntity cityEntity = tuple.get(0, CityEntity.class);
        CityModel tourModel = converter.convertToModel(cityEntity);
        tourModel.setCountryCode(tuple.get("countryCode", String.class));
        tourModel.setCountryName(tuple.get("countryName", String.class));
        return tourModel;
    }

}
