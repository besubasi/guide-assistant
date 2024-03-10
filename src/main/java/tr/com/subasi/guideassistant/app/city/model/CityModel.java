package tr.com.subasi.guideassistant.app.city.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CityModel extends CitySaveModel {

    private String countryCode;
    private String countryName;

}
