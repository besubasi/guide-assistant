package tr.com.subasi.guideassistant.app.activitydescription.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface ActivityDescriptionRestService extends BaseRestService<ActivityDescriptionModel, ActivityDescriptionSearchModel> {
}