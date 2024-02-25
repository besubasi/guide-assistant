package tr.com.subasi.guideassistant.app.tourdescription.service;

import jakarta.validation.constraints.NotNull;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;

public interface TourDescriptionService {

    TourDescriptionModel save(@NotNull TourDescriptionModel model);

    void deleteById(@NotNull Long id);

    TourDescriptionModel getByTourId(@NotNull Long tourId);

}
