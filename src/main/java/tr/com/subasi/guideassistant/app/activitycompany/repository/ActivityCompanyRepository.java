package tr.com.subasi.guideassistant.app.activitycompany.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitycompany.entity.ActivityCompanyEntity;

@Repository
public interface ActivityCompanyRepository extends JpaRepository<ActivityCompanyEntity, Long> {

}
