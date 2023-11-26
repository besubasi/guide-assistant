package tr.com.subasi.guideassistant.account.userrolerel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.account.userrolerel.entity.UserRoleRelEntity;

@Repository
public interface UserRoleRelRepository extends JpaRepository<UserRoleRelEntity, Long> {

}

