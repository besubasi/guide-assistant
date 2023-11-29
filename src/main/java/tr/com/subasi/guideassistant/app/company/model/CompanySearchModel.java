package tr.com.subasi.guideassistant.app.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CompanySearchModel extends BaseSearchModel {

    private String code, name, address, websiteUrl, imageUrl;
    private Long countryId, cityId, districtId;
    private Boolean active;

}



