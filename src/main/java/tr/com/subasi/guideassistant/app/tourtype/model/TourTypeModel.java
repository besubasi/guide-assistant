package tr.com.subasi.guideassistant.app.tourtype.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotNull
    private Long tourCategoryId;
    @NotBlank
    private String name;
    private Boolean active = Boolean.TRUE;

}
