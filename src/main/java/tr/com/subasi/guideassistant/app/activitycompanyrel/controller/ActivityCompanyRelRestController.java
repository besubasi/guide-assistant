package tr.com.subasi.guideassistant.app.activitycompanyrel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.activitycompanyrel.constant.ActivityCompanyRelConstant;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSaveModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.service.ActivityCompanyRelService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController2;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.util.List;

@RestController
@RequestMapping(ActivityCompanyRelConstant.REQUEST_MAPPING)
public class ActivityCompanyRelRestController extends BaseRestController2<ActivityCompanyRelService, ActivityCompanyRelSaveModel, ActivityCompanyRelModel, ActivityCompanyRelSearchModel> implements ActivityCompanyRelRestService {

    public ActivityCompanyRelRestController(ActivityCompanyRelService service) {
        super(service);
    }

    @Override
    public ApiResponse<Boolean> saveBatch(List<ActivityCompanyRelSaveModel> modelList) {
        return new ApiResponse<>(service.saveBatch(modelList));
    }
}