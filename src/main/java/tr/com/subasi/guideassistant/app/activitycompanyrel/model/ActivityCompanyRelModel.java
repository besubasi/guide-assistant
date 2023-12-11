package tr.com.subasi.guideassistant.app.activitycompanyrel.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityCompanyRelModel extends BaseModel {

    @NotNull
    private Long activityId;
    @NotNull
    private Long activityCompanyId;
    private Boolean active = Boolean.TRUE;

}
