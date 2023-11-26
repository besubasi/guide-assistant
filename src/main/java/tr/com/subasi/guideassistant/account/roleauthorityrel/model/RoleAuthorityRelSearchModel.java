package tr.com.subasi.guideassistant.account.roleauthorityrel.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoleAuthorityRelSearchModel extends BaseSearchModel {

    private Long roleId, authorityId;
    private Boolean active;

}
