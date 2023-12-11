package tr.com.subasi.guideassistant.app.tourtype.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourTypeSearchModel extends BaseSearchModel {

    private Long companyId;
    private Long tourCategoryId;
    private String name;
    private Boolean active;

}



