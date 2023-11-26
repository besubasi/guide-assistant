package tr.com.subasi.guideassistant.app.city.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

}
