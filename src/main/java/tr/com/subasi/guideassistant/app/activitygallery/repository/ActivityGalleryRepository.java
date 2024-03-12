package tr.com.subasi.guideassistant.app.activitygallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;

import java.util.List;

@Repository
public interface ActivityGalleryRepository extends JpaRepository<ActivityGalleryEntity, Long> {

    List<ActivityGalleryEntity> getByActivityIdOrderByLineNumber(Long activityId);

}