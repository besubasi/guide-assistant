package tr.com.subasi.guideassistant.app.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.account.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

}
