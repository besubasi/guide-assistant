package tr.com.subasi.guideassistant.app.tour.service;

import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.common.service.BaseService;

import java.util.List;

public interface TourService extends BaseService<TourModel, TourSearchModel> {

    List<TourModel> getList2(TourSearchModel searchModel);

}
