package tr.com.subasi.guideassistant.app.tourdaydescription.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionSearchModel;
import tr.com.subasi.guideassistant.common.service.BaseService;

import java.util.List;

public interface TourDayDescriptionService extends BaseService<TourDayDescriptionModel, TourDayDescriptionSearchModel> {

    List<TourDayDescriptionModel> getListByTourId(@Valid @NotNull Long tourId);

}
