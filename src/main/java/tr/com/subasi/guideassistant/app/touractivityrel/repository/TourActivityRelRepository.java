package tr.com.subasi.guideassistant.app.touractivityrel.repository;

import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityDetailRequest;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;

import java.util.List;

@Repository
public interface TourActivityRelRepository extends JpaRepository<TourActivityRelEntity, Long> {

    List<Tuple> getList(TourActivityRelSearchModel searchModel);

    List<ActivityEntity> getActivityList(TourActivityDetailRequest request);

    List<ActivityGalleryEntity> getActivityGalleryList(TourActivityDetailRequest request);

}

