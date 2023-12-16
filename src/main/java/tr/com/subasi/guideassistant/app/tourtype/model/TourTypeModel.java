package tr.com.subasi.guideassistant.app.tourtype.model;

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
public class TourTypeModel extends IdModel {

    @NotNull
    private Long companyId;
    @NotNull
    private Long tourCategoryId;
    @NotBlank
    private String name;
    private Boolean active = Boolean.TRUE;

}
