package tr.com.subasi.guideassistant.app.activitytariff.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityTariffSearchModel extends BaseSearchModel {

    private Long activityId;
    private Long pricingTypeId;
    private LocalDateTime startDate;
    private String comment;
    private Long currencyId;
    private Boolean active = Boolean.TRUE;

}



