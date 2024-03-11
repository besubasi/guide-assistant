package tr.com.subasi.guideassistant.app.district.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DistrictModel extends DistrictSaveModel {

    private String countryName;
    private String cityName;

}
