package tr.com.subasi.guideassistant.app.tripcustomer.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TripCustomerSaveModel {

    @NotNull
    private Integer lineNumber;

    @NotNull
    private String name;

    @NotNull
    private String phoneNumber;

    @NotNull
    private Long pricingTypeId;

    @NotNull
    private Boolean negativeBalance = Boolean.FALSE;
    private BigDecimal negativeBalanceLimit = BigDecimal.ZERO;

    private Integer relationLineNumber;
}
