package tr.com.subasi.guideassistant.app.language.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.language.entity.LanguageEntity;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity, Long> {

}
