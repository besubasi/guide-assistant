package tr.com.subasi.guideassistant.account.roleauthorityrel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;

import static tr.com.subasi.guideassistant.account.roleauthorityrel.constant.RoleAuthorityRelConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_ACCOUNT, name = TABLE_NAME)
@SequenceGenerator(name = SEQUENCE_GENERATOR, sequenceName = TABLE_SEQ_NAME, allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class RoleAuthorityRelEntity extends BaseEntity {
    @NotNull
    @Column(name = COLUMN_ROLE_ID)
    private Long roleId;

    @NotNull
    @Column(name = COLUMN_AUTHORITY_ID)
    private Long authorityId;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private Boolean active = Boolean.TRUE;

}
