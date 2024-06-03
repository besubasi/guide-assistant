package tr.com.subasi.guideassistant.common.session.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginMobileModel {
    @NotBlank(message = "Please enter the phone number")
    private String phoneNumber;
}
