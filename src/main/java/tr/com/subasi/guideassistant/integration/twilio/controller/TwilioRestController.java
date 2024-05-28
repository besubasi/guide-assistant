package tr.com.subasi.guideassistant.integration.twilio.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
public class TwilioRestController {

    @Value("${twilio.userName}")
    private String twilioUserName;

    @Value("${twilio.password}")
    private String twilioPassword;


    @GetMapping(value = "twilio/sendSms")
    public ResponseEntity<String> sendSms() {

        Twilio.init(twilioUserName, twilioPassword);

        Message.creator(new PhoneNumber("+905543078004"),
                new PhoneNumber("+14128444511"), "Selamün Aleyküm yeğenim").create();

        return new ResponseEntity<>("Message sent successfully", HttpStatus.OK);
    }
}