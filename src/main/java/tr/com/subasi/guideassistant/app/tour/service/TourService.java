package tr.com.subasi.guideassistant.app.tour.service;

import jakarta.validation.constraints.NotNull;
import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSaveModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityDetailRequest;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

public interface TourService {

    TourSaveModel save(@NotNull TourSaveModel model);

    void deleteById(@NotNull Long id);

    TourModel getById(@NotNull Long id);

    List<TourModel> getList(@NotNull TourSearchModel searchModel);

    Page<TourModel> getPage(@NotNull TourSearchModel searchModel);

    List<ActivityModel> getActivityList(TourActivityDetailRequest tourActivityDetailRequest);

}
