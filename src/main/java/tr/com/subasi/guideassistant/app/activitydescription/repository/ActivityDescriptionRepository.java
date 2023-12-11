package tr.com.subasi.guideassistant.app.activitydescription.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitydescription.entity.ActivityDescriptionEntity;

@Repository
public interface ActivityDescriptionRepository extends JpaRepository<ActivityDescriptionEntity, Long> {

}
