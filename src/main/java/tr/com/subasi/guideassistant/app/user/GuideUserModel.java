package tr.com.subasi.guideassistant.app.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tr.com.subasi.guideassistant.app.user.model.UserModel;
import tr.com.subasi.guideassistant.common.enums.EnumRoleType;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class GuideUserModel extends UserModel {

    private List<Long> companyIdList;
    private EnumRoleType roleType = EnumRoleType.GUIDE;


}
