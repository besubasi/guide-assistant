package tr.com.subasi.guideassistant.app.district.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DistrictSearchModel extends BaseSearchModel {

    private Long cityId;
    private String name;
    private Boolean active;

}



