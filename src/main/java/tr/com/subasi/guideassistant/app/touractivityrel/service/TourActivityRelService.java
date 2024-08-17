package tr.com.subasi.guideassistant.app.touractivityrel.service;

import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.*;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.service.BaseService2;

import java.util.List;

public interface TourActivityRelService extends BaseService2<TourActivityRelSaveModel, TourActivityRelModel, TourActivityRelSearchModel> {

    List<TourActivityDetailResponse> getDetail(TourActivityDetailRequest request);

    List<ActivityModel> getActivityList(TourActivityDetailRequest tourActivityDetailRequest);

}
