package tr.com.subasi.guideassistant.app.tripactivity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tripactivity.entity.TripActivityEntity;

import java.util.List;

@Repository
public interface TripActivityRepository extends JpaRepository<TripActivityEntity, Long> {

    List<TripActivityEntity> getByTripId(Long tripId);

}
