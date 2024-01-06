package tr.com.subasi.guideassistant.app.activitytariff.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffModel;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface ActivityTariffRestService extends BaseRestService<ActivityTariffModel, ActivityTariffSearchModel> {
}