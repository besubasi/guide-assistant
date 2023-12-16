package tr.com.subasi.guideassistant.app.sales.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.sales.enums.EnumSalesType;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import java.math.BigDecimal;

import static tr.com.subasi.guideassistant.app.sales.constant.SalesConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class SalesEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_TRIP_CUSTOMER_ID)
    private Long tripCustomerId;

    @NotNull
    @Column(name = COLUMN_TRIP_ACTIVITY_ID)
    private Long tripActivityId;

    @NotNull
    @Column(name = COLUMN_PAYMENT_TYPE_ID)
    private Long paymentTypeId;

    @NotNull
    @Column(name = COLUMN_ACCOUNT_TRANSACTION_ID)
    private Long accountTransactionId;

    @NotNull
    @Column(name = COLUMN_AMOUNT)
    private BigDecimal amount = BigDecimal.ZERO;

    @NotNull
    @Column(name = COLUMN_CURRENCY_ID)
    private Long currencyId;

    @NotNull
    @Column(name = COLUMN_LOCAL_AMOUNT)
    private BigDecimal localAmount = BigDecimal.ZERO;

    @Column(name = COLUMN_SERVICE_AMOUNT)
    private BigDecimal serviceAmount = BigDecimal.ZERO;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    @Column(name = COLUMN_SALES_TYPE)
    private EnumSalesType salesType;

    @NotNull
    @Column(name = COLUMN_IS_VALID)
    private Boolean valid = Boolean.TRUE;

    @Column(name = COLUMN_RELATED_SALES_ID)
    private Long relatedSalesId;

}
