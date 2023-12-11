package tr.com.subasi.guideassistant.account.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserSearchModel extends BaseSearchModel {

    private String userName;
    private String name;
    private String password;
    private String phoneNumber;
    private String email;
    private Long languageId;
    private Long referenceUserId;
    private Boolean active;

}
