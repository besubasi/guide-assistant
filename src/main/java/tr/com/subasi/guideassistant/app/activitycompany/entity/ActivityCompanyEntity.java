package tr.com.subasi.guideassistant.app.activitycompany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.activitycompany.constant.ActivityCompanyConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class ActivityCompanyEntity extends IdEntity {

    @NotBlank
    @Column(name = COLUMN_NAME)
    private String name;

    @Column(name = COLUMN_ADDRESS)
    private String address;

    @Column(name = COLUMN_PHONE_NUMBER)
    private String phoneNumber;

    @Column(name = COLUMN_FIRST_USER)
    private String firstUser;

    @Column(name = COLUMN_FIRST_USER_PHONE)
    private String firstUserPhone;

    @Column(name = COLUMN_FIRST_USER_EMAIL)
    private String firstUserEmail;

    @Column(name = COLUMN_SECOND_USER)
    private String secondUser;

    @Column(name = COLUMN_SECOND_USER_PHONE)
    private String secondUserPhone;

    @Column(name = COLUMN_SECOND_USER_EMAIL)
    private String secondUserEmail;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private Boolean active = Boolean.TRUE;

}
