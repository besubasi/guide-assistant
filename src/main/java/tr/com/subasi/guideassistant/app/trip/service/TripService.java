package tr.com.subasi.guideassistant.app.trip.service;

import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.trip.model.*;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.session.model.LoginResponse;

import java.util.List;

@Validated
public interface TripService {

    TripSaveResponse save(@NotNull TripSaveModel model);

    void deleteById(@NotNull Long id);

    TripModel getById(@NotNull Long id);

    List<LookupModel> getLookupList(@NotNull TripSearchModel searchModel);

    List<TripModel> getList(@NotNull TripSearchModel searchModel);

    Page<TripModel> getPage(@NotNull TripSearchModel searchModel);

    LoginResponse joinTrip(JoinTripRequest joinTripRequest);

    TripCompletionModel getCompletionRate(@NotNull Long id);

}
