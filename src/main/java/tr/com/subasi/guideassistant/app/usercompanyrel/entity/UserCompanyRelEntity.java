package tr.com.subasi.guideassistant.app.usercompanyrel.entity;

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

import static tr.com.subasi.guideassistant.app.usercompanyrel.constant.UserCompanyRelConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_ACCOUNT, name = TABLE_NAME)
@SequenceGenerator(name = SEQUENCE_GENERATOR, sequenceName = TABLE_SEQ_NAME, allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class UserCompanyRelEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_USER_ID)
    private Long userId;

    @NotNull
    @Column(name = COLUMN_COMPANY_ID)
    private Long companyId;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private Boolean active = Boolean.TRUE;

}
