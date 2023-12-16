package tr.com.subasi.guideassistant.account.user.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserModel extends IdModel {

    @NotNull
    private String userName;
    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String email;
    @NotNull
    private Long languageId;
    private Long referenceUserId;
    private Boolean active;

}
