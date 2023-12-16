package tr.com.subasi.guideassistant.app.company.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CompanyModel extends IdModel {

    private String code;
    @NotNull
    private String name;
    @NotNull
    private Long countryId;
    @NotNull
    private Long cityId;
    @NotNull
    private Long districtId;
    private String address;
    private String websiteUrl;
    private String imageUrl;

    private Boolean active = Boolean.TRUE;

}
