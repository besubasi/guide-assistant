package tr.com.subasi.guideassistant.app.touractivityrel.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourActivityDetailRequest {
    @NotNull
    private Long tourId;

    private Short dayNumber;

}
