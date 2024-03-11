package tr.com.subasi.guideassistant.app.company.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.company.converter.CompanyConverter;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.company.model.CompanyModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySaveModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;
import tr.com.subasi.guideassistant.app.company.repository.CompanyRepository;
import tr.com.subasi.guideassistant.app.company.repository.CompanyRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl extends BaseServiceImpl2<CompanySaveModel, CompanyModel, CompanySearchModel, CompanyEntity, CompanyRepository, CompanyConverter> implements CompanyService {
    public CompanyServiceImpl(CompanyRepositoryImpl repository, CompanyConverter converter) {
        super(repository, converter);
    }

    @Override
    public List<CompanyModel> getList(CompanySearchModel searchModel) {
        List<Tuple> tupleList = repository.getList(searchModel);
        return this.convertToModel(tupleList);
    }

    private List<CompanyModel> convertToModel(List<Tuple> tupleList) {
        List<CompanyModel> companyModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                companyModelList.add(this.convertToModel(tuple))
        );
        return companyModelList;
    }

    private CompanyModel convertToModel(Tuple tuple) {
        CompanyEntity companyEntity = tuple.get(0, CompanyEntity.class);
        CompanyModel tourModel = converter.convertToModel(companyEntity);
        tourModel.setCountryName(tuple.get("countryName", String.class));
        tourModel.setCityName(tuple.get("cityName", String.class));
        tourModel.setDistrictName(tuple.get("districtName", String.class));
        return tourModel;
    }

}
