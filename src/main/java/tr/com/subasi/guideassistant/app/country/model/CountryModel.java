package tr.com.subasi.guideassistant.app.country.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryModel extends BaseModel {

    private String code, name;
    private boolean isActive = true;

}
