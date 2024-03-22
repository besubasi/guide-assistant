package tr.com.subasi.guideassistant.app.activitycompanyrel.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSaveModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;
import tr.com.subasi.guideassistant.common.service.BaseService2;

import java.util.List;

@Validated
public interface ActivityCompanyRelService extends BaseService2<ActivityCompanyRelSaveModel, ActivityCompanyRelModel, ActivityCompanyRelSearchModel> {

    Boolean saveBatch(@Valid @NotEmpty List<ActivityCompanyRelSaveModel> modelList);
}
