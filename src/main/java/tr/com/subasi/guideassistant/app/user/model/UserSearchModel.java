package tr.com.subasi.guideassistant.app.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSearchModel {

    private Long id;
    private String userName, name, surname, phoneNumber, email;

}
