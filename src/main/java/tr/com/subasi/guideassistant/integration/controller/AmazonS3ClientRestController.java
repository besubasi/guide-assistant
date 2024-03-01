package tr.com.subasi.guideassistant.integration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.integration.service.AmazonS3ClientService;

import java.util.List;

@RestController
@RequestMapping("/guide/amazon-s3")
public class AmazonS3ClientRestController implements AmazonS3ClientRestService {

    private final AmazonS3ClientService amazonS3ClientService;

    public AmazonS3ClientRestController(AmazonS3ClientService amazonS3ClientService) {
        this.amazonS3ClientService = amazonS3ClientService;
    }

    @Override
    public String getBucketName() {
        return amazonS3ClientService.getBucketName();
    }

    @Override
    public List<String> listBucket() {
        return amazonS3ClientService.listBucket();
    }


}