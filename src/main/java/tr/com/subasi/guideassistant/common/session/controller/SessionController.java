package tr.com.subasi.guideassistant.common.session.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import tr.com.subasi.guideassistant.app.user.GuideUserModel;
import tr.com.subasi.guideassistant.app.user.service.UserService;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.session.model.LoginMobileModel;
import tr.com.subasi.guideassistant.common.session.model.LoginModel;
import tr.com.subasi.guideassistant.common.session.model.LoginResponse;
import tr.com.subasi.guideassistant.common.session.service.AuthenticationService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@Slf4j
//@SecurityRequirement(name = "bearerAuth")
public class SessionController {

    private final UserService userService;
    private final AuthenticationService authenticationService;


    public SessionController(UserService userService, AuthenticationService authenticationService) {
        this.userService = userService;
        this.authenticationService = authenticationService;
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        log.info("Welcome Page");
        return ResponseEntity.ok("Welcome Page");
    }

    @PostMapping("/register")
    public ApiResponse<GuideUserModel> addNewUser(@Valid @RequestBody GuideUserModel guideUserModel) {
        return new ApiResponse<>(userService.saveGuideUser(guideUserModel));
    }

    @PostMapping("/login")
    public ApiResponse<LoginResponse> login(@Valid @RequestBody LoginModel loginModel) {
        return new ApiResponse<>(authenticationService.login(loginModel));
    }

    @PostMapping("/loginMobile")
    public ApiResponse<LoginResponse> login(@Valid @RequestBody LoginMobileModel loginMobileModel) {
        return new ApiResponse<>(authenticationService.loginTraveler(loginMobileModel.getPhoneNumber()));
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("getUser endpoint");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin() {
        return ResponseEntity.ok("getAdmin endpoint");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
