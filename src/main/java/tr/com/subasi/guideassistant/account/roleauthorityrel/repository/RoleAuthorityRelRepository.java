package tr.com.subasi.guideassistant.account.roleauthorityrel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.account.roleauthorityrel.entity.RoleAuthorityRelEntity;

@Repository
public interface RoleAuthorityRelRepository extends JpaRepository<RoleAuthorityRelEntity, Long> {

}

