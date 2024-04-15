package tr.com.subasi.guideassistant.app.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.user.GuideUserModel;
import tr.com.subasi.guideassistant.app.user.constant.UserConstant;
import tr.com.subasi.guideassistant.app.user.model.UserModel;
import tr.com.subasi.guideassistant.app.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.app.user.service.UserService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.LookupModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

@RestController
@RequestMapping(UserConstant.REQUEST_MAPPING)
public class UserRestController implements UserRestService {

    private final UserService service;

    public UserRestController(UserService service) {
        this.service = service;
    }

    public ApiResponse<UserModel> save(UserModel model) {
        return new ApiResponse<>(service.save(model));
    }

    @Override
    public ApiResponse<GuideUserModel> saveGuideUser(GuideUserModel model) {
        return new ApiResponse<>(service.saveGuideUser(model));
    }

    public void deleteById(Long id) {
        service.deleteById(id);
    }

    public ApiResponse<UserModel> getById(Long id) {
        return new ApiResponse<>(service.getById(id));
    }

    public ApiResponse<List<LookupModel>> getLookupList(UserSearchModel searchModel) {
        return new ApiResponse<>(service.getLookupList(searchModel));
    }

    public ApiResponse<List<UserModel>> getList(UserSearchModel searchModel) {
        return new ApiResponse<>(service.getList(searchModel));
    }

    public ApiResponse<Page<UserModel>> getPage(UserSearchModel searchModel) {
        return new ApiResponse<>(service.getPage(searchModel));
    }
}
