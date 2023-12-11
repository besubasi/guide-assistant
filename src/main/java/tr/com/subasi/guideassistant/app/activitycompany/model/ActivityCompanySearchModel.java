package tr.com.subasi.guideassistant.app.activitycompany.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityCompanySearchModel extends BaseSearchModel {

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



