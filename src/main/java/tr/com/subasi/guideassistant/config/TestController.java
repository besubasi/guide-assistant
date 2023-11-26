package tr.com.subasi.guideassistant.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public endpoint";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Admin endpoint";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "User endpoint";
    }
}
