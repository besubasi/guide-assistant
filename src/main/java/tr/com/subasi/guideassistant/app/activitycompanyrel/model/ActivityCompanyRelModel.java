package tr.com.subasi.guideassistant.app.activitycompanyrel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityCompanyRelModel extends ActivityCompanyRelSaveModel {

    private String activityCompanyName;

}
