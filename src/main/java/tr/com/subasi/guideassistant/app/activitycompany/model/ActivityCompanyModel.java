package tr.com.subasi.guideassistant.app.activitycompany.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityCompanyModel extends IdModel {

    @NotBlank
    private String name;
    private String address;
    private String phoneNumber;
    private String firstUser;
    private String firstUserPhone;
    private String firstUserEmail;
    private String secondUser;
    private String secondUserPhone;
    private String secondUserEmail;
    private Boolean active = Boolean.TRUE;

}
