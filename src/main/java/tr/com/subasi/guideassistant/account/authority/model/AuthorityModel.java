package tr.com.subasi.guideassistant.account.authority.model;

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
public class AuthorityModel extends BaseModel {

    @NotBlank
    private String code;
    @NotBlank
    private String description;
    private Boolean active = Boolean.TRUE;

}
