package tr.com.subasi.guideassistant.app.exchange.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ExchangeSearchModel extends BaseSearchModel {

    private Long currencyId;
    private LocalDate startDate;

}



