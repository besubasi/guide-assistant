package tr.com.subasi.guideassistant.app.activitytariff.repository;

import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitytariff.entity.ActivityTariffEntity;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSearchModel;

import java.util.List;

@Repository
public interface ActivityTariffRepository extends JpaRepository<ActivityTariffEntity, Long> {

    List<Tuple> getList(ActivityTariffSearchModel searchModel);
}
