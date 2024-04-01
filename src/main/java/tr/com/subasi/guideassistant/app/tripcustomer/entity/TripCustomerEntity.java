package tr.com.subasi.guideassistant.app.tripcustomer.entity;

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

import static tr.com.subasi.guideassistant.app.tripcustomer.constant.TripCustomerConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class TripCustomerEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_TRIP_ID)
    private Long tripId;

    @NotNull
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_PHONE_NUMBER)
    private String phoneNumber;

    @Column(name = COLUMN_USER_ID)
    private Long userId;

    @NotNull
    @Column(name = COLUMN_PRICING_TYPE_ID)
    private Long pricingTypeId;

    @Column(name = COLUMN_RELATION_TRIP_CUSTOMER_ID)
    private Long relationTripCustomerId;

    @NotNull
    @Column(name = COLUMN_IS_NEGATIVE_BALANCE)
    private Boolean negativeBalance = Boolean.FALSE;

    @NotNull
    @Column(name = COLUMN_NEGATIVE_BALANCE_LIMIT)
    private BigDecimal negativeBalanceLimit = BigDecimal.ZERO;

    @NotNull
    @Column(name = COLUMN_ACTIVATION_CODE)
    private String activationCode;

}
