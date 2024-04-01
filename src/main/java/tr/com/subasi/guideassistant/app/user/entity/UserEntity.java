package tr.com.subasi.guideassistant.app.user.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.IdEntity;
import tr.com.subasi.guideassistant.common.enums.EnumRoleType;

import static tr.com.subasi.guideassistant.app.user.constant.UserConstant.*;

@Data
@NoArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_PHONE_NUMBER)
    private String phoneNumber;

    @NotNull
    @Column(name = COLUMN_PASSWORD)
    private String password;

    @NotNull
    @Column(name = COLUMN_ROLE_TYPE)
    @Enumerated(value = EnumType.STRING)
    private EnumRoleType roleType = EnumRoleType.TRAVELER;

    @Column(name = COLUMN_EMAIL)
    private String email;

    @NotNull
    @Column(name = COLUMN_LANGUAGE_ID)
    private Long languageId;

    @Column(name = COLUMN_REFERENCE_USER_ID)
    private Long referenceUserId;

    @Column(name = COLUMN_ACTIVE_TRIP_ID)
    private Long activeTripId;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private boolean active;

}
