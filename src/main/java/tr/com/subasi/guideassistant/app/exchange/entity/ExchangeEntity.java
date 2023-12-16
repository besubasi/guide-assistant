package tr.com.subasi.guideassistant.app.exchange.entity;

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
import java.time.LocalDate;

import static tr.com.subasi.guideassistant.app.exchange.constant.ExchangeConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class ExchangeEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_CURRENCY_ID)
    private Long currencyId;

    @NotNull
    @Column(name = COLUMN_DATE)
    private LocalDate startDate;

    @NotNull
    @Column(name = COLUMN_UNIT)
    private Short unit;

    @NotNull
    @Column(name = COLUMN_FOREX_BUYING)
    private BigDecimal forexBuying;

    @NotNull
    @Column(name = COLUMN_FOREX_SELLING)
    private BigDecimal forexSelling;

    @Column(name = COLUMN_BANKNOTE_BUYING)
    private BigDecimal banknoteBuying;

    @Column(name = COLUMN_BANKNOTE_SELLING)
    private BigDecimal banknoteSelling;

}
