package tr.com.subasi.guideassistant.app.touractivityrel.model;

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
public class TourActivityRelModel extends BaseModel {

    @NotNull
    private Long tourId;
    @NotNull
    private Long activityId;
    @NotNull
    private Short dayNumber;
    @NotNull
    private Short lineNumber;
    private Boolean active = Boolean.TRUE;

}
