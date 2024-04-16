package tr.com.subasi.guideassistant.app.tripcustomer.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TripCustomerSaveModel {

    @NotNull
    private Integer lineNumber;
    private Integer relationLineNumber;

    @NotNull
    private String name;

    @NotNull
    private String phoneNumber;

    private String email;

    @NotNull
    private Long pricingTypeId;

    @NotNull
    private Boolean negativeBalance = Boolean.FALSE;
    private BigDecimal negativeBalanceLimit = BigDecimal.ZERO;

}
