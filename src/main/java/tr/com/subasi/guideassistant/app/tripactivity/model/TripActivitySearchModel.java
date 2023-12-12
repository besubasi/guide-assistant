package tr.com.subasi.guideassistant.app.tripactivity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TripActivitySearchModel extends BaseSearchModel {

    private Long tripId;
    private Long activityId;
    private Short dayNumber;
    private Short lineNumber;
    private String estimatedTime;
    private Long activityCompanyId;
    private Boolean extra;
    private Boolean active;

}



