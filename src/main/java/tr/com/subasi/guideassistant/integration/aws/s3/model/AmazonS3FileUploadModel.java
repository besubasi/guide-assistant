package tr.com.subasi.guideassistant.integration.aws.s3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmazonS3FileUploadModel {
    private String folderName;
    private String fileName;
    private byte[] content;

}
