package tr.com.subasi.guideassistant.app.activitytariff.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.currency.entity.CurrencyEntity;
import tr.com.subasi.guideassistant.app.pricingtype.entity.PricingTypeEntity;
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

    @Column(name = COLUMN_DESCRIPTION)
    private String description;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_ACTIVITY_ID, foreignKey = @ForeignKey(name = FK_ACTIVITY_TARIFF_TO_ACTIVITY), insertable = false, updatable = false)
    private ActivityEntity activity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_PRICING_TYPE_ID, foreignKey = @ForeignKey(name = FK_ACTIVITY_TARIFF_TO_PRICING_TYPE), insertable = false, updatable = false)
    private PricingTypeEntity pricingType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_CURRENCY_ID, foreignKey = @ForeignKey(name = FK_ACTIVITY_TARIFF_TO_CURRENCY), insertable = false, updatable = false)
    private CurrencyEntity currency;

}
