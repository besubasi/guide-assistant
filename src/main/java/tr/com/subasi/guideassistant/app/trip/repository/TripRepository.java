package tr.com.subasi.guideassistant.app.trip.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.trip.entity.TripEntity;

@Repository
public interface TripRepository extends JpaRepository<TripEntity, Long> {

}
