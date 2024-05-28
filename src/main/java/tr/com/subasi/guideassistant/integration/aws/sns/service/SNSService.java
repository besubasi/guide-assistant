package tr.com.subasi.guideassistant.integration.aws.sns.service;

import tr.com.subasi.guideassistant.integration.aws.sns.model.*;

public interface SNSService {

    SendOtpResponse sendOtp(SendOtpRequest sendOtpRequest);

    ValidateOtpResponse validateOtp(ValidateOtpRequest validateOtpRequest);

    SendSmsResponse sendSms(SendSmsRequest sendSmsRequest);

}

