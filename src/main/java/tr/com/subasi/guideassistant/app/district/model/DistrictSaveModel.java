package tr.com.subasi.guideassistant.app.district.model;

import jakarta.validation.constraints.NotBlank;
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
public class DistrictSaveModel extends IdModel {

    @NotNull
    private Long countryId;
    @NotNull
    private Long cityId;
    @NotBlank
    private String name;
    private boolean active;

}
