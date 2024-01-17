package tr.com.subasi.guideassistant.app.tourgallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourgallery.entity.TourGalleryEntity;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGallerySearchModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

@Repository
public interface TourGalleryRepository extends JpaRepository<TourGalleryEntity, Long> {

    List<TourGalleryEntity> getList(TourGallerySearchModel searchModel);

    Page<TourGalleryEntity> getPage(TourGallerySearchModel searchModel);

}