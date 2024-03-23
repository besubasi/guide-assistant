package tr.com.subasi.guideassistant.app.touractivityrel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourActivityRelModel extends TourActivityRelSaveModel {

    private String tourCode, tourName, activityCode, activityName;

}
