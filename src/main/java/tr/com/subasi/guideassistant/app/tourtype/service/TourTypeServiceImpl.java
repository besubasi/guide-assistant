package tr.com.subasi.guideassistant.app.tourtype.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourtype.converter.TourTypeConverter;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeModel;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeSearchModel;
import tr.com.subasi.guideassistant.app.tourtype.repository.TourTypeRepositoryImpl;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourTypeServiceImpl extends BaseServiceImpl<TourTypeModel, TourTypeSearchModel, TourTypeEntity, TourTypeRepositoryImpl, TourTypeConverter> implements TourTypeService {
    public TourTypeServiceImpl(TourTypeRepositoryImpl repository, TourTypeConverter converter) {
        super(repository, converter);
    }

    @Override
    public List<LookupModel> getLookupList(TourTypeSearchModel searchModel) {
        List<Tuple> tupleList = repository.getList(searchModel);
        return this.convertToLookupModel(tupleList);
    }

    @Override
    public List<TourTypeModel> getList(TourTypeSearchModel searchModel) {
        List<Tuple> tupleList = repository.getList(searchModel);
        return this.convertToModel(tupleList);
    }

    private List<TourTypeModel> convertToModel(List<Tuple> tupleList) {
        List<TourTypeModel> tourCategoryModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                tourCategoryModelList.add(this.convertToModel(tuple))
        );
        return tourCategoryModelList;
    }

    private TourTypeModel convertToModel(Tuple tuple) {
        TourTypeEntity tourCategoryEntity = tuple.get(0, TourTypeEntity.class);
        TourTypeModel tourModel = converter.convertToModel(tourCategoryEntity);
        tourModel.setCompanyCode(tuple.get("companyCode", String.class));
        tourModel.setCompanyName(tuple.get("companyName", String.class));
        tourModel.setTourCategoryName(tuple.get("tourCategoryName", String.class));
        return tourModel;
    }

    private List<LookupModel> convertToLookupModel(List<Tuple> tupleList) {
        List<LookupModel> tourCategoryModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                tourCategoryModelList.add(converter.convertToLookupModel(tuple.get(0, TourTypeEntity.class)))
        );
        return tourCategoryModelList;
    }
}
