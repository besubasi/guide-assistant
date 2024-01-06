package tr.com.subasi.guideassistant.app.activity.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.activity.model.ActivityModel;
import tr.com.subasi.guideassistant.app.activity.model.ActivitySearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface ActivityRestService extends BaseRestService<ActivityModel, ActivitySearchModel> {
}
