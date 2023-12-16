package tr.com.subasi.guideassistant.app.trip.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TripModel extends IdModel {

    @NotNull
    private String code;
    @NotNull
    private Long tourId;
    @NotNull
    private Long firstGuideUserId;
    private Long secondGuideUserId;
    @NotNull
    private LocalDate startDate;
    @NotNull
    private Integer day;


}
