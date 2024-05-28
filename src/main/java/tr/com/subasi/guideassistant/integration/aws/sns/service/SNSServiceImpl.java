package tr.com.subasi.guideassistant.integration.aws.sns.service;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.integration.aws.sns.model.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
@Slf4j
public class SNSServiceImpl implements SNSService {

    private static final int OTP_VALIDITY_DURATION = 5 * 60 * 1000; // 5 minute
    private static final int MAX_ATTEMPTS = 3;

    private final Map<String, ActiveOtpModel> otpStorageMap = new HashMap<>();

    private final AmazonSNS amazonSNS;

    public SNSServiceImpl() {
        this.amazonSNS = AmazonSNSClientBuilder.defaultClient();
    }

    public SendSmsResponse sendSms(SendSmsRequest sendSmsRequest) {

        Map<String, MessageAttributeValue> smsAttributes = new HashMap<>();
        smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue()
                .withStringValue("GUIDEASSIST") // Sender
                .withDataType("String"));

        PublishRequest request = new PublishRequest()
                .withMessage(sendSmsRequest.getMessage())
                .withPhoneNumber(sendSmsRequest.getPhoneNumber())
                .withMessageAttributes(smsAttributes);


        PublishResult result = amazonSNS.publish(request);
        log.info("MessageId - " + result.getMessageId());
        return new SendSmsResponse(true);
    }


    public SendOtpResponse sendOtp(SendOtpRequest sendOtpRequest) {
        Random rand = new Random();
        int otp = 100000 + rand.nextInt(900000);
        ActiveOtpModel otpDetails = new ActiveOtpModel(otp, System.currentTimeMillis(), 0);
        otpStorageMap.put(sendOtpRequest.getPhoneNumber(), otpDetails);
        this.sendSms(SendSmsRequest.builder().phoneNumber(sendOtpRequest.getPhoneNumber()).phoneNumber("Doğrulama kodunuz : " + otp).build());
        return SendOtpResponse.builder().phoneNumber(sendOtpRequest.getPhoneNumber()).otp(otp).result(true).build();
    }

    public ValidateOtpResponse validateOtp(ValidateOtpRequest validateOtpRequest) {
        String phoneNumber = validateOtpRequest.getPhoneNumber();
        ActiveOtpModel otpDetails = otpStorageMap.get(phoneNumber);

        if (otpDetails == null)
            return new ValidateOtpResponse(false);

        if (isOTPExpired(otpDetails)) {
            otpStorageMap.remove(phoneNumber);
            return new ValidateOtpResponse(false);
        }

        if (isMaxAttemptsReached(otpDetails))
            return new ValidateOtpResponse(false);

        if (isOtpValid(otpDetails, validateOtpRequest.getUserOtpInput())) {
            otpStorageMap.remove(phoneNumber);
            return new ValidateOtpResponse(true);
        } else {
            otpDetails.incrementAttempts();
            return new ValidateOtpResponse(false);
        }
    }

    private boolean isOTPExpired(ActiveOtpModel otpDetails) {
        return System.currentTimeMillis() - otpDetails.getTimestamp() > OTP_VALIDITY_DURATION;
    }

    private boolean isMaxAttemptsReached(ActiveOtpModel otpDetails) {
        return otpDetails.getAttempts() >= MAX_ATTEMPTS;
    }

    private boolean isOtpValid(ActiveOtpModel otpDetails, int userOtpInput) {
        return otpDetails.getOtp() == userOtpInput;
    }

}

