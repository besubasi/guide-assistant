package tr.com.subasi.guideassistant.account.authority.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.account.authority.entity.AuthorityEntity;

@Repository
public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Long> {

}

