package tr.com.subasi.guideassistant.app.activitygallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGallerySearchModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

@Repository
public interface ActivityGalleryRepository extends JpaRepository<ActivityGalleryEntity, Long> {

    List<ActivityGalleryEntity> getList(ActivityGallerySearchModel searchModel);

    Page<ActivityGalleryEntity> getPage(ActivityGallerySearchModel searchModel);

}