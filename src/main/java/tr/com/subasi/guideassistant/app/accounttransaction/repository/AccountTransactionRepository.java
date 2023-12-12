package tr.com.subasi.guideassistant.app.accounttransaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.accounttransaction.entity.AccountTransactionEntity;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransactionEntity, Long> {

}
