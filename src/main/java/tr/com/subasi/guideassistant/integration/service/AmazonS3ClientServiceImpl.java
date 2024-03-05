package tr.com.subasi.guideassistant.integration.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;
import tr.com.subasi.guideassistant.integration.model.AmazonS3FileUploadModel;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AmazonS3ClientServiceImpl implements AmazonS3ClientService {

    @Value("${aws.s3.bucketName}")
    private String bucketName;

    @Value("${aws.s3.bucketUrl}")
    private String bucketUrl;

    private final S3Client s3Client;

    public AmazonS3ClientServiceImpl(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    @Override
    public String getBucketName() {
        return bucketName;
    }

    @Override
    public List<String> listBucket() {

        List<String> bucketNameList = new ArrayList<>();
        ListBucketsResponse listBucketsResponse = s3Client.listBuckets();

        if (listBucketsResponse.hasBuckets()) {
            System.out.println("hasBuckets = true");
            for (Bucket bucket : listBucketsResponse.buckets()) {
                bucketNameList.add(bucket.name());
                System.out.println("Bucket Name = " + bucket.name());
            }
        } else {
            System.out.println("hasBuckets = false");
        }
        return bucketNameList;
    }

    @Override
    public String uploadContent(AmazonS3FileUploadModel model) {
        String key = model.getFolderName() + "/" + model.getFileName();
        return this.uploadContentByKey(key, model.getContent());
    }

    @Override
    public String uploadContentByKey(String key, byte[] content) {

        Map<String, String> metadata = new HashMap<>();
        metadata.put("Content-Type", "image/jpeg");

        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                .bucket(this.bucketName)
                .key(key)
                .metadata(metadata)
                .build();

        InputStream inputStream = new ByteArrayInputStream(content);
        PutObjectResponse putObjectResponse = s3Client.putObject(putObjectRequest, RequestBody.fromInputStream(inputStream, content.length));

        System.out.println("putObjectResponse = " + putObjectResponse);
        try {
            inputStream.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }

        return bucketUrl + key;
    }

    @Override
    public void deleteContentByUrl(String contentUrl) {
        String key = contentUrl.replace(bucketUrl, "");
        this.deleteContentByKey(key);
    }

    @Override
    public void deleteContentByKey(String key) {
        DeleteObjectRequest deleteObjectRequest = DeleteObjectRequest.builder()
                .bucket(this.bucketName)
                .key(key)
                .build();
        s3Client.deleteObject(deleteObjectRequest);
    }

    @Override
    public void updateContentByUrl(String contentUrl, byte[] content) {
        String key = contentUrl.replace(bucketUrl, "");
        this.deleteContentByKey(key);
        this.uploadContentByKey(key, content);
    }
}
