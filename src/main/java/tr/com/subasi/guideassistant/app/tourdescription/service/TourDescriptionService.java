package tr.com.subasi.guideassistant.app.tourdescription.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;

@Validated
public interface TourDescriptionService {

    TourDescriptionModel save(@Valid @NotNull TourDescriptionModel model);

    void deleteById(@Valid @NotNull Long id);

    TourDescriptionModel getByTourId(@Valid @NotNull Long tourId);

}
