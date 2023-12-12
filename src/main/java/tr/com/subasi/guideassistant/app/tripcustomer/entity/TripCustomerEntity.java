package tr.com.subasi.guideassistant.app.tripcustomer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;

import static tr.com.subasi.guideassistant.app.tripcustomer.constant.TripCustomerConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@SequenceGenerator(name = SEQUENCE_GENERATOR, sequenceName = TABLE_SEQ_NAME, allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class TripCustomerEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_TRIP_ID)
    private Long tripId;

    @NotNull
    @Column(name = COLUMN_USER_ID)
    private Long userId;

    @NotNull
    @Column(name = COLUMN_PRICING_TYPE_ID)
    private Long pricingTypeId;

    @Column(name = COLUMN_RELATION_USER_ID)
    private Long relationUserId;

    @NotNull
    @Column(name = COLUMN_IS_NEGATIVE_BALANCE)
    private Boolean negativeBalance = Boolean.FALSE;


}
