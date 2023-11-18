package tr.com.subasi.guideassistant.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.BaseEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER", schema = "GUIDE")
@SequenceGenerator(name = "user_seq_generator", sequenceName = "user_seq", allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseEntity {

    @NotNull
    @Column(name = "USER_NAME")
    private String userName;

    @NotNull
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotNull
    private String email;

    @NotNull
    @Column(name = "IS_ACTIVE")
    private boolean isActive = true;

}
