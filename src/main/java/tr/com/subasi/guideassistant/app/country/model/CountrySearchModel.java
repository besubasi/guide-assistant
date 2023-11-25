package tr.com.subasi.guideassistant.app.country.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountrySearchModel {
    private Long id;
    private String code, name;
    private Boolean isActive;

}
