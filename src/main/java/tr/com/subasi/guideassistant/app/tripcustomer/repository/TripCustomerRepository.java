package tr.com.subasi.guideassistant.app.tripcustomer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tripcustomer.entity.TripCustomerEntity;

@Repository
public interface TripCustomerRepository extends JpaRepository<TripCustomerEntity, Long> {

}
