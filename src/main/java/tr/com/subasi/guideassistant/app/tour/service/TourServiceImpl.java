package tr.com.subasi.guideassistant.app.tour.service;

import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.mapper.TourMapper;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourServiceImpl extends GenericServiceImpl<TourModel, TourSearchModel, TourEntity> implements tr.com.subasi.guideassistant.app.tour.service.TourService {

    public TourServiceImpl(TourRepository repository, TourMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public List<TourModel> getList(TourSearchModel searchModel) {
        TourRepository tourRepository = (TourRepository) super.jpaRepository;
        TourMapper tourMapper = (TourMapper) baseMapper;

        List<Tuple> tupleList = tourRepository.getListWithCompanyAndTourType();

        List<TourModel> tourModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple -> {
            TourEntity tourEntity = tuple.get(1, TourEntity.class);
            TourModel tourModel = tourMapper.convertToModel(tourEntity);
            tourModel.setTourCode(tuple.get(2, String.class));
            tourModel.setTourName(tuple.get(3, String.class));
            tourModel.setTourTypeName(tuple.get(4, String.class));
            tourModelList.add(tourModel);
        });

        return tourModelList;
    }
}
