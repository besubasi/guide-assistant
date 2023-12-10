package tr.com.subasi.guideassistant.app.tourcategory.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;

@Repository
public interface TourCategoryRepository extends JpaRepository<TourCategoryEntity, Long> {

}
