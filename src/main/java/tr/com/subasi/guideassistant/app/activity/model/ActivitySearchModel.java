package tr.com.subasi.guideassistant.app.activity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivitySearchModel extends BaseSearchModel {

    private String code;
    private String name;
    private String estimatedTime;
    private Boolean extra;
    private Boolean active;

}



