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

        List<Tuple> tupleList = repository.getListWithCompanyAndTourType();

        List<TourModel> tourModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple -> {
            TourEntity tourEntity = tuple.get(1, TourEntity.class);
            TourModel tourModel = converter.convertToModel(tourEntity);
            tourModel.setTourCode(tuple.get(2, String.class));
            tourModel.setTourName(tuple.get(3, String.class));
            tourModel.setTourTypeName(tuple.get(4, String.class));
            tourModelList.add(tourModel);
        });

        return tourModelList;
    }
}
