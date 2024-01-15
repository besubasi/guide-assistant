package tr.com.subasi.guideassistant.app.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.country.model.CountrySearchModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

    List<CountryEntity> getList(CountrySearchModel searchModel);

    Page<CountryEntity> getPage(CountrySearchModel searchModel);

}
