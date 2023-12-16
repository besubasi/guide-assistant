package tr.com.subasi.guideassistant.app.account.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AccountModel extends IdModel {

    @NotNull
    private Long userId;
    private String name;
    @NotNull
    private BigDecimal amount = BigDecimal.ZERO;
    @NotNull
    private Long currencyId;

}
