package tr.com.subasi.guideassistant.app.activitytariff.entity;

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
import java.time.LocalDateTime;

import static tr.com.subasi.guideassistant.app.activitytariff.constant.ActivityTariffConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class ActivityTariffEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_ACTIVITY_ID)
    private Long activityId;

    @NotNull
    @Column(name = COLUMN_PRICING_TYPE_ID)
    private Long pricingTypeId;

    @NotNull
    @Column(name = COLUMN_START_DATE)
    private LocalDateTime startDate;

    @Column(name = COLUMN_COMMENT)
    private String comment;

    @NotNull
    @Column(name = COLUMN_AMOUNT)
    private BigDecimal amount;

    @NotNull
    @Column(name = COLUMN_CURRENCY_ID)
    private Long currencyId;

    @Column(name = COLUMN_COMMISSION_RATE)
    private BigDecimal commissionRate;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private boolean active;

}
