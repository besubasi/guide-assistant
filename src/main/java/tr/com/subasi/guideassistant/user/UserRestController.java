package tr.com.subasi.guideassistant.user;

import org.springframework.web.bind.annotation.*;
import tr.com.subasi.guideassistant.user.model.UserModel;
import tr.com.subasi.guideassistant.user.model.UserSearchModel;
import tr.com.subasi.guideassistant.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    UserModel save(@RequestBody UserModel userModel) {
        return userService.save(userModel);
    }

    @DeleteMapping("/deleteById/{id}")
    void deleteById(@PathVariable long id) {
        userService.deleteById(id);
    }

    @GetMapping("/getById/{id}")
    UserModel getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping("/getList")
    List<UserModel> getList(@RequestBody UserSearchModel userSearchModel) {
        return userService.getList(userSearchModel);
    }

    @PostMapping("/getPage")
    List<UserModel> getPage(@RequestBody UserSearchModel userSearchModel) {
        return userService.getPage(userSearchModel);
    }
}
