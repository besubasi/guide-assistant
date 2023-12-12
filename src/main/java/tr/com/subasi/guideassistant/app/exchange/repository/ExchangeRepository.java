package tr.com.subasi.guideassistant.app.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.exchange.entity.ExchangeEntity;

@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeEntity, Long> {

}
