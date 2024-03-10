package tr.com.subasi.guideassistant.app.district.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.district.converter.DistrictConverter;
import tr.com.subasi.guideassistant.app.district.entity.DistrictEntity;
import tr.com.subasi.guideassistant.app.district.model.DistrictModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSaveModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;
import tr.com.subasi.guideassistant.app.district.repository.DistrictRepository;
import tr.com.subasi.guideassistant.app.district.repository.DistrictRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictServiceImpl extends BaseServiceImpl2<DistrictSaveModel, DistrictModel, DistrictSearchModel, DistrictEntity, DistrictRepository, DistrictConverter> implements DistrictService {
    public DistrictServiceImpl(DistrictRepositoryImpl repository, DistrictConverter converter) {
        super(repository, converter);
    }


    @Override
    public List<DistrictModel> getList(DistrictSearchModel searchModel) {
        List<Tuple> tupleList = repository.getList(searchModel);
        return this.convertToModel(tupleList);
    }

    private List<DistrictModel> convertToModel(List<Tuple> tupleList) {
        List<DistrictModel> districtModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                districtModelList.add(this.convertToModel(tuple))
        );
        return districtModelList;
    }

    private DistrictModel convertToModel(Tuple tuple) {
        DistrictEntity districtEntity = tuple.get(0, DistrictEntity.class);
        DistrictModel tourModel = converter.convertToModel(districtEntity);
        tourModel.setCountryCode(tuple.get("countryCode", String.class));
        tourModel.setCountryName(tuple.get("countryName", String.class));
        tourModel.setCityName(tuple.get("cityName", String.class));
        return tourModel;
    }
}
