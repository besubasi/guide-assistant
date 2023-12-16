package tr.com.subasi.guideassistant.app.accounttransaction.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.accounttransaction.enums.EnumAccountType;
import tr.com.subasi.guideassistant.app.accounttransaction.enums.EnumDebitType;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static tr.com.subasi.guideassistant.app.accounttransaction.constant.AccountTransactionConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class AccountTransactionEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_ACCOUNT_ID)
    private Long accountId;

    @Column(name = COLUMN_TRIP_ID)
    private Long tripId;

    @NotNull
    @Column(name = COLUMN_DATE)
    private LocalDateTime date;

    @NotNull
    @Column(name = COLUMN_AMOUNT)
    private BigDecimal amount = BigDecimal.ZERO;

    @NotNull
    @Column(name = COLUMN_CURRENCY_ID)
    private Long currencyId;

    @NotNull
    @Column(name = COLUMN_LOCAL_AMOUNT)
    private BigDecimal localAmount = BigDecimal.ZERO;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    @Column(name = COLUMN_ACCOUNT_TYPE)
    private EnumAccountType accountType;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    @Column(name = COLUMN_DEBIT_TYPE)
    private EnumDebitType debitType;


}
