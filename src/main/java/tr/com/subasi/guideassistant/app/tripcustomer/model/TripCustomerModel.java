package tr.com.subasi.guideassistant.app.tripcustomer.model;

import jakarta.validation.constraints.NotBlank;
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
public class TripCustomerModel extends IdModel {

    @NotNull
    private Long tripId;

    @NotNull
    private Integer lineNumber;
    private Integer relationLineNumber;

    @NotNull
    private String name;

    @NotBlank
    private String phoneNumber;

    @NotNull
    private Long pricingTypeId;

    private String email;

    @NotNull
    private Boolean negativeBalance = Boolean.FALSE;
    private BigDecimal negativeBalanceLimit = BigDecimal.ZERO;

    private Long userId;

}
