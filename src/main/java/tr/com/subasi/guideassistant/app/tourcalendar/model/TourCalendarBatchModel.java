package tr.com.subasi.guideassistant.app.tourcalendar.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourCalendarBatchModel {

    @NotNull
    private Long tourId;
    @NotEmpty
    private List<LocalDate> startDateList;
}
