package tr.com.subasi.guideassistant.app.sales.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.sales.enums.EnumSalesType;
import tr.com.subasi.guideassistant.common.model.IdModel;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SalesModel extends IdModel {

    @NotNull
    private Long tripCustomerId;
    @NotNull
    private Long tripActivityId;
    @NotNull
    private Long paymentTypeId;
    @NotNull
    private Long accountTransactionId;
    @NotNull
    private BigDecimal amount = BigDecimal.ZERO;
    @NotNull
    private Long currencyId;
    @NotNull
    private BigDecimal localAmount = BigDecimal.ZERO;
    private BigDecimal serviceAmount = BigDecimal.ZERO;
    @NotNull
    private EnumSalesType salesType;
    @NotNull
    private Boolean valid = Boolean.TRUE;
    private Long relatedSalesId;

}
