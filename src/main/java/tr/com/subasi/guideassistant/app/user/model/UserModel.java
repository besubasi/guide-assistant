package tr.com.subasi.guideassistant.app.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel extends BaseModel {

    private String userName, name, surname, phoneNumber, email;

}
