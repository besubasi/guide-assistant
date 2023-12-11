package tr.com.subasi.guideassistant.app.activitydescription.model;

import jakarta.validation.constraints.NotBlank;
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
public class ActivityDescriptionModel extends BaseModel {

    @NotNull
    private Long activityId;
    @NotBlank
    private String descriptionFirst;
    private String descriptionSecond;

}
