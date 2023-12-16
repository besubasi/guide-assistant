package tr.com.subasi.guideassistant.app.tripactivitypricing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import java.math.BigDecimal;

import static tr.com.subasi.guideassistant.app.tripactivitypricing.constant.TripActivityPricingConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class TripActivityPricingEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_TRIP_ACTIVITY_ID)
    private Long tripActivityId;

    @NotNull
    @Column(name = COLUMN_PRICING_TYPE_ID)
    private Long pricingTypeId;

    @NotNull
    @Column(name = COLUMN_AMOUNT)
    private BigDecimal amount;

    @NotNull
    @Column(name = COLUMN_CURRENCY_ID)
    private Long currencyId;

}
