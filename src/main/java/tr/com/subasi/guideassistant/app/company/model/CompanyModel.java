package tr.com.subasi.guideassistant.app.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CompanyModel extends CompanySaveModel {

    private String countryName;
    private String cityName;
    private String districtName;

}
