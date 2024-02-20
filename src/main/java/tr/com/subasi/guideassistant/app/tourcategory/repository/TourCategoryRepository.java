package tr.com.subasi.guideassistant.app.tourcategory.repository;


import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySearchModel;

import java.util.List;

@Repository
public interface TourCategoryRepository extends JpaRepository<TourCategoryEntity, Long> {

    List<Tuple> getList(TourCategorySearchModel searchModel);

}
