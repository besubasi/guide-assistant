package tr.com.subasi.guideassistant.app.tripactivitypricing.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TripActivityPricingModel extends IdModel {

    @NotNull
    private Long tripActivityId;
    @NotNull
    private Long pricingTypeId;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private Long currencyId;

}
