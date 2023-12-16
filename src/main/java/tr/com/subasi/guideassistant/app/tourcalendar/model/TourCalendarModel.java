package tr.com.subasi.guideassistant.app.tourcalendar.model;

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
public class TourCalendarModel extends IdModel {

    @NotNull
    private Long tourId;
    @NotNull
    private LocalDate startDate;

}
