package tr.com.subasi.guideassistant.app.tourcategory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourCategoryModel extends IdModel {

    private Long companyId;
    private String name, companyCode, companyName;
    private Boolean active;

}
