package tr.com.subasi.guideassistant.app.tour.repository;

import jakarta.persistence.Tuple;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;

import java.util.List;

public interface TourRepositoryCustom {

    List<Tuple> getList2(TourSearchModel searchModel);

}
