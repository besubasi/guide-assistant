package tr.com.subasi.guideassistant.app.tourcategory.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourcategory.converter.TourCategoryConverter;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategoryModel;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySaveModel;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySearchModel;
import tr.com.subasi.guideassistant.app.tourcategory.repository.TourCategoryRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl2;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourCategoryServiceImpl extends BaseServiceImpl2<TourCategorySaveModel, TourCategoryModel, TourCategorySearchModel, TourCategoryEntity, TourCategoryRepositoryImpl, TourCategoryConverter> implements TourCategoryService {
    public TourCategoryServiceImpl(TourCategoryRepositoryImpl repository, TourCategoryConverter converter) {
        super(repository, converter);
    }

    @Override
    public List<TourCategoryModel> getList(TourCategorySearchModel searchModel) {
        List<Tuple> tupleList = repository.getList(searchModel);
        return this.convertToModel(tupleList);
    }

    private List<TourCategoryModel> convertToModel(List<Tuple> tupleList) {
        List<TourCategoryModel> tourCategoryModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                tourCategoryModelList.add(this.convertToModel(tuple))
        );
        return tourCategoryModelList;
    }

    private TourCategoryModel convertToModel(Tuple tuple) {
        TourCategoryEntity tourCategoryEntity = tuple.get(0, TourCategoryEntity.class);
        TourCategoryModel tourModel = converter.convertToModel(tourCategoryEntity);
        tourModel.setCompanyCode(tuple.get("companyCode", String.class));
        tourModel.setCompanyName(tuple.get("companyName", String.class));
        return tourModel;
    }
}
