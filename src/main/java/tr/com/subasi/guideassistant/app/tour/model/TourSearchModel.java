package tr.com.subasi.guideassistant.app.tour.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourSearchModel extends BaseSearchModel {

    private Long companyId;
    private Long tourTypeId;
    private String code;
    private String name;
    private Integer day;
    private Boolean active;

}



