package tr.com.subasi.guideassistant.app.activitytariff.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityTariffModel extends IdModel {

    @NotNull
    private Long activityId;
    @NotNull
    private Long pricingTypeId;
    @NotNull
    private LocalDateTime startDate;
    private String comment;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private Long currencyId;
    private BigDecimal commissionRate;
    private Boolean active = Boolean.TRUE;

}
