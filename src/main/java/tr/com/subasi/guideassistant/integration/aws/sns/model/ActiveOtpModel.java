package tr.com.subasi.guideassistant.integration.aws.sns.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActiveOtpModel {

    private int otp;
    private long timestamp;
    private int attempts;

    public void incrementAttempts() {
        this.attempts++;
    }

}
