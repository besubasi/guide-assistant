package tr.com.subasi.guideassistant.app.tourcategory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourCategorySearchModel extends BaseSearchModel {

    private Long companyId;
    private String name;
    private Boolean active;

}



