package tr.com.subasi.guideassistant.common.session.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.user.entity.UserEntity;

import static tr.com.subasi.guideassistant.common.constant.CommonConstant.SCHEMA_GUIDE;
import static tr.com.subasi.guideassistant.common.session.constant.TokenConstant.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
public class TokenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = COLUMN_USER_ID)
    private Long userId;

    @Column(unique = true)
    private String token;
    private boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_USER_ID, foreignKey = @ForeignKey(name = FK_TOKEN_TO_USER), insertable = false, updatable = false)
    private UserEntity user;

    @Override
    public String toString() {
        return token;
    }

}
