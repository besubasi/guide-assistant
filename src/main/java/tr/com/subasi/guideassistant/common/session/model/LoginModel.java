package tr.com.subasi.guideassistant.common.session.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginModel {
    @NotBlank(message = "Please enter the username field")
    private String username;
    @NotBlank(message = "Please enter the password field")
    private String password;
}
