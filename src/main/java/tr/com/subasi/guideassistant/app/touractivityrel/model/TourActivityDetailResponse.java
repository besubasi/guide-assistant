package tr.com.subasi.guideassistant.app.touractivityrel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGalleryModel;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourActivityDetailResponse implements Serializable {

    private ActivityModel activity;
    private List<ActivityGalleryModel> activityGalleryList;

}
