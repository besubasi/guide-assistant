package tr.com.subasi.guideassistant.app.activitydescription.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;
import tr.com.subasi.guideassistant.app.activitydescription.service.ActivityDescriptionService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import static tr.com.subasi.guideassistant.app.activitydescription.constant.ActivityDescriptionConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class ActivityDescriptionRestController implements ActivityDescriptionRestService {

    private final ActivityDescriptionService service;

    public ActivityDescriptionRestController(ActivityDescriptionService service) {
        this.service = service;
    }

    @Override
    public ApiResponse<ActivityDescriptionModel> save(ActivityDescriptionModel model) {
        return new ApiResponse<>(this.service.save(model));
    }

    @Override
    public void deleteById(Long id) {
        this.service.deleteById(id);
    }

    @Override
    public ApiResponse<ActivityDescriptionModel> getByActivityId(Long activityId) {
        return new ApiResponse<>(this.service.getByActivityId(activityId));
    }
}
