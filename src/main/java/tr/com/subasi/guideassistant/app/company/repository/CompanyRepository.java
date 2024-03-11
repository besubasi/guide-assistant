package tr.com.subasi.guideassistant.app.company.repository;

import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

    List<Tuple> getList(CompanySearchModel searchModel);

}
