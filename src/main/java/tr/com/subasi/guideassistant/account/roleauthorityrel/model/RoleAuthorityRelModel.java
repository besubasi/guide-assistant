package tr.com.subasi.guideassistant.account.roleauthorityrel.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoleAuthorityRelModel extends IdModel {

    @NotBlank
    private Long roleId;
    @NotBlank
    private Long authorityId;
    private Boolean active = Boolean.TRUE;

}
