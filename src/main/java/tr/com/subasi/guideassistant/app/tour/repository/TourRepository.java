package tr.com.subasi.guideassistant.app.tour.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;

@Repository
public interface TourRepository extends JpaRepository<TourEntity, Long> {

}
