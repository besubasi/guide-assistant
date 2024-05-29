package tr.com.subasi.guideassistant.app.trip.service;

import jakarta.validation.constraints.NotNull;
import tr.com.subasi.guideassistant.app.trip.model.TripModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSaveModel;
import tr.com.subasi.guideassistant.app.trip.model.TripSaveResponse;
import tr.com.subasi.guideassistant.app.trip.model.TripSearchModel;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

public interface TripService {

    TripSaveResponse save(@NotNull TripSaveModel model);

    void deleteById(@NotNull Long id);

    TripModel getById(@NotNull Long id);

    List<LookupModel> getLookupList(@NotNull TripSearchModel searchModel);

    List<TripModel> getList(@NotNull TripSearchModel searchModel);

    Page<TripModel> getPage(@NotNull TripSearchModel searchModel);

}
