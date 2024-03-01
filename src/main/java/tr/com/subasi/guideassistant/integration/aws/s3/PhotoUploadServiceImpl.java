//package tr.com.subasi.guideassistant.integration.aws.s3;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.*;
//import org.springframework.web.multipart.MultipartFile;
//import software.amazon.awssdk.core.sync.RequestBody;
//import software.amazon.awssdk.services.s3.S3Client;
//import software.amazon.awssdk.services.s3.model.PutObjectRequest;
//import software.amazon.awssdk.services.s3.model.PutObjectResponse;
//
//import java.io.IOException;
//
//@Service
//public class PhotoUploadServiceImpl implements PhotoUploadService{
//
//    private final S3Client s3Client;
//    private final String bucketName;
//
//    public PhotoUploadService(S3Client s3Client, @Value("${aws.s3.bucketName}") String bucketName) {
//        this.s3Client = s3Client;
//        this.bucketName = bucketName;
//    }
//
//    public void uploadPhoto(MultipartFile file) throws IOException {
//
//        String theTags = "name="+file.getName()+"&description=s3";
//
//        PutObjectRequest putOb = PutObjectRequest.builder()
//                .bucket(bucketName)
//                .key(file.getName())
//                .tagging(theTags)
//                .build();
//
//        PutObjectResponse putObjectResponse = s3Client.putObject(putOb, RequestBody.fromBytes(file.getBytes()));
//        putObjectResponse.getValueForField()
//
//
//        String fileName = file.getOriginalFilename();
//        ObjectMetadata metadata = ObjectMetadata.builder()
//                .contentType(file.getContentType())
//                .contentLength(file.getSize())
//                .build();
//        PutObjectRequest request = PutObjectRequest.builder()
//                .bucket(bucketName)
//                .key(fileName)
//                .metadata(metadata)
//                .build();
//        s3Client.putObject(request, RequestBody.fromInputStream(file.getInputStream(), file.getSize()));
//    }
//
//}
