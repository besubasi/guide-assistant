package tr.com.subasi.guideassistant.app.tripcustomer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TripCustomerSearchModel extends BaseSearchModel {

    private Long tripId;
    private Long userId;
    private Long pricingTypeId;
    private Long relationUserId;
    private Boolean negativeBalance;

}



