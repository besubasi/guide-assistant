package tr.com.subasi.guideassistant.app.activity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityEntity, Long> {

}
