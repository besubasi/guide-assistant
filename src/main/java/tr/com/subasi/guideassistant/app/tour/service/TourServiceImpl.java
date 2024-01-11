package tr.com.subasi.guideassistant.app.tour.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tour.converter.TourConverter;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourServiceImpl extends BaseServiceImpl<TourModel, TourSearchModel, TourEntity, TourRepository, TourConverter> implements TourService {

    @Autowired
    public TourServiceImpl(TourRepository repository, TourConverter converter) {
        super(repository, converter);
    }

    @Override
    public List<TourModel> getList2(TourSearchModel searchModel) {
        List<Tuple> tupleList = repository.getList2(searchModel);
        return this.convertToModel(tupleList);
    }

    private List<TourModel> convertToModel(List<Tuple> tupleList) {
        List<TourModel> tourModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                tourModelList.add(this.convertToModel(tuple))
        );
        return tourModelList;
    }

    private TourModel convertToModel(Tuple tuple) {
        TourEntity tourEntity = tuple.get(0, TourEntity.class);
        TourModel tourModel = converter.convertToModel(tourEntity);
        tourModel.setCompanyCode(tuple.get("companyCode", String.class));
        tourModel.setCompanyName(tuple.get("companyName", String.class));
        tourModel.setTourTypeName(tuple.get("tourTypeName", String.class));
        return tourModel;
    }
}
