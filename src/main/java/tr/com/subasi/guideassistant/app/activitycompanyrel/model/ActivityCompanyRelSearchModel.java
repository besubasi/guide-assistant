package tr.com.subasi.guideassistant.app.activitycompanyrel.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityCompanyRelSearchModel extends BaseSearchModel {

    private Long activityId;
    private Long activityCompanyId;
    private Boolean active;

}
