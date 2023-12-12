package tr.com.subasi.guideassistant.app.sales.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.sales.entity.SalesEntity;

@Repository
public interface SalesRepository extends JpaRepository<SalesEntity, Long> {

}
