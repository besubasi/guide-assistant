package tr.com.subasi.guideassistant.app.accounttransaction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.accounttransaction.enums.EnumAccountType;
import tr.com.subasi.guideassistant.app.accounttransaction.enums.EnumDebitType;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AccountTransactionSearchModel extends BaseSearchModel {

    private Long accountId;
    private Long tripId;
    private LocalDateTime date;
    private Long currencyId;
    private EnumAccountType accountType;
    private EnumDebitType debitType;

}



