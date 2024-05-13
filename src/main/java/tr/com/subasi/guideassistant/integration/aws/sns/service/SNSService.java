package tr.com.subasi.guideassistant.integration.aws.sns.service;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import org.springframework.stereotype.Service;

@Service
public class SNSService {

    private final AmazonSNS amazonSNS;

    public SNSService() {
        this.amazonSNS = AmazonSNSClientBuilder.defaultClient();
    }

    public void sendSMS(String phoneNumber, String message) {
        PublishRequest request = new PublishRequest()
                .withMessage(message)
                .withPhoneNumber(phoneNumber);

        PublishResult result = amazonSNS.publish(request);
        System.out.println("MessageId - " + result.getMessageId());
    }
}
