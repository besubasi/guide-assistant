package tr.com.subasi.guideassistant.app.tour.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourModel extends TourSaveModel {

    private String companyCode;
    private String companyName;
    private String tourTypeName;
    private String tourCategoryName;

}
