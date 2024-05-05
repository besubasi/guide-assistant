package tr.com.subasi.guideassistant.common.session.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.common.session.entity.TokenEntity;

import java.util.List;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, Long> {

    TokenEntity findByToken(String token);

    List<TokenEntity> findByExpiredIsFalseAndUserId(Long userId);

}
