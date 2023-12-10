package tr.com.subasi.guideassistant.app.tourcalendar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourCalendarSearchModel extends BaseSearchModel {

    private Long tourId;
    private LocalDate startDate;

}



