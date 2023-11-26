package tr.com.subasi.guideassistant.account.userrolerel.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserRoleRelSearchModel extends BaseSearchModel {

    private Long userId, roleId;
    private Boolean active;

}
