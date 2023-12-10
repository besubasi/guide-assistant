package tr.com.subasi.guideassistant.app.tourcalendar.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourcalendar.entity.TourCalendarEntity;

@Repository
public interface TourCalendarRepository extends JpaRepository<TourCalendarEntity, Long> {

}
