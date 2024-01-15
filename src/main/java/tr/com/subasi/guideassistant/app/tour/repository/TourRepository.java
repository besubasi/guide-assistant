package tr.com.subasi.guideassistant.app.tour.repository;


import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

@Repository
public interface TourRepository extends JpaRepository<TourEntity, Long> {

    List<Tuple> getList2(TourSearchModel searchModel);

    Page<Tuple> getPage2(TourSearchModel searchModel);


}
