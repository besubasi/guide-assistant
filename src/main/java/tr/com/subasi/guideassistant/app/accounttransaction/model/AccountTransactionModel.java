package tr.com.subasi.guideassistant.app.accounttransaction.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.accounttransaction.enums.EnumAccountType;
import tr.com.subasi.guideassistant.app.accounttransaction.enums.EnumDebitType;
import tr.com.subasi.guideassistant.common.model.IdModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AccountTransactionModel extends IdModel {

    @NotNull
    private Long accountId;
    private Long tripId;
    @NotNull
    private LocalDateTime date;
    @NotNull
    private BigDecimal amount = BigDecimal.ZERO;
    @NotNull
    private Long currencyId;
    @NotNull
    private BigDecimal localAmount = BigDecimal.ZERO;
    @NotNull
    private EnumAccountType accountType;
    @NotNull
    private EnumDebitType debitType;

}
