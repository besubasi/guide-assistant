package tr.com.subasi.guideassistant.integration.service;

import tr.com.subasi.guideassistant.integration.model.AmazonS3FileUploadModel;

import java.util.List;

public interface AmazonS3ClientService {

    String getBucketName();

    List<String> listBucket();

    String uploadContent(AmazonS3FileUploadModel model);

    String uploadContentByKey(String key, byte[] content);

    void deleteContentByUrl(String contentUrl);

    void deleteContentByKey(String key);

}
