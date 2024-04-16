package tr.com.subasi.guideassistant.integration.excel.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TripCustomerExcelModel {

    private String name, phoneNumber, email, pricingTypeCode;
    private Integer relationLineNumber;

}
