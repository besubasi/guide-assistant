package tr.com.subasi.guideassistant.integration.aws.sns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.integration.aws.sns.model.SMSRequest;
import tr.com.subasi.guideassistant.integration.aws.sns.service.SNSService;

@RestController
public class SMSController {

    private final SNSService snsService;

    @Autowired
    public SMSController(SNSService snsService) {
        this.snsService = snsService;
    }

    @PostMapping("/sendSMS")
    public String sendSMS(@RequestBody SMSRequest request) {
        snsService.sendSMS(request.getPhoneNumber(), request.getMessage());
        return "SMS sent successfully";
    }
}
