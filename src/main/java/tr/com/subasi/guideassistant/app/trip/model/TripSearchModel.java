package tr.com.subasi.guideassistant.app.trip.model;

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
public class TripSearchModel extends BaseSearchModel {

    private String code;
    private Long tourId;
    private Long firstGuideUserId;
    private Long secondGuideUserId;
    private LocalDate startDate;
    private Integer day;

}



