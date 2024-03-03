package tr.com.subasi.guideassistant.app.tourgallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourgallery.entity.TourGalleryEntity;

import java.util.List;

@Repository
public interface TourGalleryRepository extends JpaRepository<TourGalleryEntity, Long> {

    List<TourGalleryEntity> getByTourIdOrderByLineNumber(Long tourId);

}