package tr.com.subasi.guideassistant.app.activitycompanyrel.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityCompanyRelModel extends IdModel {

    @NotNull
    private Long activityId;
    @NotNull
    private Long activityCompanyId;
    private Boolean active = Boolean.TRUE;

}
