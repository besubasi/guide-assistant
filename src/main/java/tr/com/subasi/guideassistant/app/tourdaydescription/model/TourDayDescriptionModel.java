package tr.com.subasi.guideassistant.app.tourdaydescription.model;

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
public class TourDayDescriptionModel extends IdModel {

    @NotNull
    private Long tourId;
    @NotNull
    private Short dayNumber;
    @NotBlank
    private String description;

}
