package tr.com.subasi.guideassistant.app.user.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tr.com.subasi.guideassistant.common.enums.EnumRoleType;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserModel extends IdModel {

    @NotNull
    protected String name;
    private String username;
    @NotNull
    protected String phoneNumber;
    protected String password;
    protected String email;
    protected Long languageId;
    protected String referencePhoneNumber;
    protected EnumRoleType roleType = EnumRoleType.TRAVELER;
    private Long activeTripId;
    private boolean active;

}
