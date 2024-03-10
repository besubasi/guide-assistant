package tr.com.subasi.guideassistant.app.district.repository;

import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.district.entity.DistrictEntity;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<DistrictEntity, Long> {

    List<Tuple> getList(DistrictSearchModel searchModel);


}
