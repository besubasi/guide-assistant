package tr.com.subasi.guideassistant.app.tripactivity.model;

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
public class TripActivityModel extends IdModel {

    @NotNull
    private Long tripId;
    @NotNull
    private Long activityId;
    @NotNull
    private Short dayNumber;
    @NotNull
    private Short lineNumber;
    private String estimatedTime;
    private Long activityCompanyId;
    private Boolean extra = Boolean.FALSE;
    private Boolean active = Boolean.TRUE;

}
