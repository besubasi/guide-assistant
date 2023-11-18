package tr.com.subasi.guideassistant.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private Long id;
    private String userName;
    private String phoneNumber;
    private String name;
    private String surname;
    private String email;

}
