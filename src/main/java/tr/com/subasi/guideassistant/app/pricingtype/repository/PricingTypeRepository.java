package tr.com.subasi.guideassistant.app.pricingtype.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.pricingtype.entity.PricingTypeEntity;

@Repository
public interface PricingTypeRepository extends JpaRepository<PricingTypeEntity, Long> {

}
