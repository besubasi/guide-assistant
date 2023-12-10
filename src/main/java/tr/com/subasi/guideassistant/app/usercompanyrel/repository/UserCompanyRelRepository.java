package tr.com.subasi.guideassistant.app.usercompanyrel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.usercompanyrel.entity.UserCompanyRelEntity;

@Repository
public interface UserCompanyRelRepository extends JpaRepository<UserCompanyRelEntity, Long> {

}

