package tr.com.subasi.guideassistant.app.tourdescription.model;

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
public class TourDescriptionModel extends BaseModel {

    @NotNull
    private Long tourId;
    @NotBlank
    private String descriptionFirst;
    private String descriptionSecond;

}
