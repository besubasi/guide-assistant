package tr.com.subasi.guideassistant.integration.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface AmazonS3ClientRestService {

    @GetMapping(value = "/getBucketName", produces = MediaType.APPLICATION_JSON_VALUE)
    String getBucketName();

    @GetMapping(value = "/listBucket", produces = MediaType.APPLICATION_JSON_VALUE)
    List<String> listBucket();

}
