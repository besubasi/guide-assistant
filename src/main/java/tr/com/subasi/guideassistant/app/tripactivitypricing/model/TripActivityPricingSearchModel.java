package tr.com.subasi.guideassistant.app.tripactivitypricing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TripActivityPricingSearchModel extends BaseSearchModel {

    private Long tripActivityId;
    private Long pricingTypeId;
    private BigDecimal amount;
    private Long currencyId;

}



