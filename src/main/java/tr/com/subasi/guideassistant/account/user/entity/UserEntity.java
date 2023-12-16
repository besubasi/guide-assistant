package tr.com.subasi.guideassistant.account.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.account.user.constant.UserConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_USER_NAME)
    private String userName;

    @NotNull
    @Column(name = COLUMN_PASSWORD)
    private String password;

    @NotNull
    @Column(name = COLUMN_PHONE_NUMBER)
    private String phoneNumber;

    @NotNull
    @Column(name = COLUMN_EMAIL)
    private String email;

    @NotNull
    @Column(name = COLUMN_LANGUAGE_ID)
    private Long languageId;

    @Column(name = COLUMN_REFERENCE_USER_ID)
    private Long referenceUserId;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private Boolean active = Boolean.TRUE;

}
