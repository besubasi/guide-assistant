package tr.com.subasi.guideassistant.app.activitytariff.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityTariffModel extends ActivityTariffSaveModel {

    private String pricingTypeCode, pricingTypeName, currencyCode, currencyName;

}
