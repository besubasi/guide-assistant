package tr.com.subasi.guideassistant.app.tripcustomer.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TripCustomerModel extends BaseModel {

    @NotNull
    private Long tripId;
    @NotNull
    private Long userId;
    @NotNull
    private Long pricingTypeId;
    private Long relationUserId;
    private Boolean negativeBalance = Boolean.FALSE;

}
