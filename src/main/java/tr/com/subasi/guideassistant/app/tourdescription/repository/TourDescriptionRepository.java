package tr.com.subasi.guideassistant.app.tourdescription.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourdescription.entity.TourDescriptionEntity;

@Repository
public interface TourDescriptionRepository extends JpaRepository<TourDescriptionEntity, Long> {

}
