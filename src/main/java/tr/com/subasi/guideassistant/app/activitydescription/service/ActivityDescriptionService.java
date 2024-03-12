package tr.com.subasi.guideassistant.app.activitydescription.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;

@Validated
public interface ActivityDescriptionService {

    ActivityDescriptionModel save(@Valid @NotNull ActivityDescriptionModel model);

    void deleteById(@Valid @NotNull Long id);

    ActivityDescriptionModel getByActivityId(@Valid @NotNull Long activityId);

}
