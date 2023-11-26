package tr.com.subasi.guideassistant.account.userrolerel.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserRoleRelModel extends BaseModel {

    @NotBlank
    private Long userId;
    @NotBlank
    private Long roleId;
    private Boolean active = Boolean.TRUE;

}
