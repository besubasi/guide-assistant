package tr.com.subasi.guideassistant.integration.aws.sns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.integration.aws.sns.model.*;
import tr.com.subasi.guideassistant.integration.aws.sns.service.SNSService;

@RestController
public class SMSController {

    private final SNSService snsService;

    @Autowired
    public SMSController(SNSService snsService) {
        this.snsService = snsService;
    }

    @PostMapping("/sendSms")
    public SendSmsResponse sendSms(@RequestBody SendSmsRequest request) {
        return snsService.sendSms(request);
    }

    @PostMapping("/sendOtp")
    public SendOtpResponse sendOtp(@RequestBody SendOtpRequest sendOtpRequest) {
        return snsService.sendOtp(sendOtpRequest);
    }

    @PostMapping("/validateOtp")
    public ValidateOtpResponse validateOtp(@RequestBody ValidateOtpRequest validateOtpRequest) {
        return snsService.validateOtp(validateOtpRequest);
    }

}
