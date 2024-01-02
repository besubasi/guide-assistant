package tr.com.subasi.guideassistant.app.tour.repository;


import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;

import java.util.List;

@Repository
public interface TourRepository extends JpaRepository<TourEntity, Long> {

    @Query("select t, c.code as companyCode, c.name as companyName,tt.name as tourTypeName " +
            "from TourEntity t " +
            "inner join CompanyEntity c on c.id=t.companyId " +
            "inner join TourTypeEntity tt on tt.id=t.tourTypeId")
    List<Tuple> getListWithCompanyAndTourType();

}
