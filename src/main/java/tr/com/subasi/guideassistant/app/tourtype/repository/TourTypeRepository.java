package tr.com.subasi.guideassistant.app.tourtype.repository;


import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeSearchModel;

import java.util.List;

@Repository
public interface TourTypeRepository extends JpaRepository<TourTypeEntity, Long> {

    List<Tuple> getList(TourTypeSearchModel searchModel);

}
