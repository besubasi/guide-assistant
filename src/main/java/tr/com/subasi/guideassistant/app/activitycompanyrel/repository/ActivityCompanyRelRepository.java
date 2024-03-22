package tr.com.subasi.guideassistant.app.activitycompanyrel.repository;

import jakarta.persistence.Tuple;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitycompanyrel.entity.ActivityCompanyRelEntity;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;

import java.util.List;

@Repository
public interface ActivityCompanyRelRepository extends JpaRepository<ActivityCompanyRelEntity, Long> {

    List<ActivityCompanyRelEntity> findByActivityId(@NotNull Long activityId);

    List<Tuple> getList(ActivityCompanyRelSearchModel searchModel);


}

