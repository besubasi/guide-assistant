package tr.com.subasi.guideassistant.app.exchange.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ExchangeModel extends IdModel {

    @NotNull
    private Long currencyId;
    @NotNull
    private LocalDate startDate;
    @NotNull
    private Short unit;
    @NotNull
    private BigDecimal forexBuying;
    @NotNull
    private BigDecimal forexSelling;
    private BigDecimal banknoteBuying;
    private BigDecimal banknoteSelling;

}
