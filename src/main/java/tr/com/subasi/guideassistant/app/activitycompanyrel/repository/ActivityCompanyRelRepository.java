package tr.com.subasi.guideassistant.app.activitycompanyrel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitycompanyrel.entity.ActivityCompanyRelEntity;

@Repository
public interface ActivityCompanyRelRepository extends JpaRepository<ActivityCompanyRelEntity, Long> {

}

