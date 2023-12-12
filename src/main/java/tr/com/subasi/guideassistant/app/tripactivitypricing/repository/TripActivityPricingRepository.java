package tr.com.subasi.guideassistant.app.tripactivitypricing.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tripactivitypricing.entity.TripActivityPricingEntity;

@Repository
public interface TripActivityPricingRepository extends JpaRepository<TripActivityPricingEntity, Long> {

}
