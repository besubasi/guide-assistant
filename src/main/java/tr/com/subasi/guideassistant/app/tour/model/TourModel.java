package tr.com.subasi.guideassistant.app.tour.model;

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
public class TourModel extends BaseModel {

    @NotNull
    private Long companyId;
    @NotNull
    private Long tourTypeId;
    @NotBlank
    private String name;
    @NotNull
    private Integer day;

    private Boolean active = Boolean.TRUE;

}
