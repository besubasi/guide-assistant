package tr.com.subasi.guideassistant.app.city.repository;

import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.city.model.CitySearchModel;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

    List<Tuple> getList(CitySearchModel searchModel);

}
