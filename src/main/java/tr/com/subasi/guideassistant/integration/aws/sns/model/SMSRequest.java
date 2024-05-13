package tr.com.subasi.guideassistant.integration.aws.sns.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SMSRequest implements Serializable {

    private String phoneNumber;
    private String message;

}
