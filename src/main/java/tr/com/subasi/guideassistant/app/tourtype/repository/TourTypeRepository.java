package tr.com.subasi.guideassistant.app.tourtype.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;

@Repository
public interface TourTypeRepository extends JpaRepository<TourTypeEntity, Long> {

}
