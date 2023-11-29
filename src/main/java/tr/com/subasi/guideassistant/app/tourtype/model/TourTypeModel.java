package tr.com.subasi.guideassistant.app.tourtype.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourTypeModel extends BaseModel {

    private Long companyId;
    @NotBlank
    private String name;
    private Boolean active = Boolean.TRUE;

}
