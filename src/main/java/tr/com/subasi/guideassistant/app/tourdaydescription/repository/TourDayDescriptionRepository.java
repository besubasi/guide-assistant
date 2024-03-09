package tr.com.subasi.guideassistant.app.tourdaydescription.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourdaydescription.entity.TourDayDescriptionEntity;

import java.util.List;

@Repository
public interface TourDayDescriptionRepository extends JpaRepository<TourDayDescriptionEntity, Long> {

    List<TourDayDescriptionEntity> findAllByTourIdOrderByDayNumber(Long tourId);

}
