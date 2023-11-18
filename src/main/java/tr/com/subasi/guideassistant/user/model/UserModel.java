package tr.com.subasi.guideassistant.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.BaseModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel extends BaseModel {

    private String userName;
    private String phoneNumber;
    private String name;
    private String surname;
    private String email;

}
