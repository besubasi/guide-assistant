package tr.com.subasi.guideassistant.common.session.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginMobileModel {
    @NotBlank(message = "Please enter the phone number")
    private String phoneNumber;
}
