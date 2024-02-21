package tr.com.subasi.guideassistant.app.tourcategory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourCategoryModel extends TourCategorySaveModel {

    private String companyCode;
    private String companyName;

}
