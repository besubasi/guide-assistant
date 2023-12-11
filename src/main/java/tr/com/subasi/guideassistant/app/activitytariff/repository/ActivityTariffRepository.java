package tr.com.subasi.guideassistant.app.activitytariff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitytariff.entity.ActivityTariffEntity;

@Repository
public interface ActivityTariffRepository extends JpaRepository<ActivityTariffEntity, Long> {

}
