package tr.com.subasi.guideassistant.app.touractivityrel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;

@Repository
public interface TourActivityRelRepository extends JpaRepository<TourActivityRelEntity, Long> {

}

