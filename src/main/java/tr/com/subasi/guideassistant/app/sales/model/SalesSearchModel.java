package tr.com.subasi.guideassistant.app.sales.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.sales.enums.EnumSalesType;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SalesSearchModel extends BaseSearchModel {

    private Long tripCustomerId;
    private Long tripActivityId;
    private Long paymentTypeId;
    private Long accountTransactionId;
    private Long currencyId;
    private EnumSalesType salesType;
    private Boolean valid;
    private Long relatedSalesId;

}



