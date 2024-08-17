package tr.com.subasi.guideassistant.app.trip.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TripCompletionModel {

    private int completedActivityCount = 0;
    private int continuedActivityCount = 0;
    private int futureActivityCount = 0;
    private int completionRate = 0;

    private List<Long> completedActivityIdList;
    private List<Long> continuedActivityIdList;
    private List<Long> futureActivityIdList;

}
