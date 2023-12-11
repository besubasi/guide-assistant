package tr.com.subasi.guideassistant.app.touractivityrel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourActivityRelSearchModel extends BaseSearchModel {

    private Long tourId;
    private Long activityId;
    private Short dayNumber;
    private Short lineNumber;
    private Boolean active = Boolean.TRUE;

}
