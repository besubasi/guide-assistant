package tr.com.subasi.guideassistant.app.activitygallery.service;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activity.repository.ActivityRepository;
import tr.com.subasi.guideassistant.app.activitygallery.converter.ActivityGalleryConverter;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGalleryModel;
import tr.com.subasi.guideassistant.app.activitygallery.repository.ActivityGalleryRepository;
import tr.com.subasi.guideassistant.integration.model.AmazonS3FileUploadModel;
import tr.com.subasi.guideassistant.integration.service.AmazonS3ClientService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ActivityGalleryServiceImpl implements ActivityGalleryService {

    private final ActivityGalleryRepository repository;
    private final ActivityGalleryConverter converter;
    private final ActivityRepository activityRepository;
    private final AmazonS3ClientService amazonS3ClientService;

    public ActivityGalleryServiceImpl(ActivityGalleryRepository repository,
                                      ActivityGalleryConverter converter,
                                      ActivityRepository activityRepository,
                                      AmazonS3ClientService amazonS3ClientService) {
        this.repository = repository;
        this.converter = converter;
        this.activityRepository = activityRepository;
        this.amazonS3ClientService = amazonS3ClientService;
    }

    @Override
    public Boolean createContentList(Long activityId, MultipartFile[] files) throws IOException {
        ActivityEntity activityEntity = activityRepository.getReferenceById(activityId);
        List<ActivityGalleryEntity> oldActivityGalleryEntityList = repository.getByActivityIdOrderByLineNumber(activityEntity.getId());
        int lineNumber = CollectionUtils.isNotEmpty(oldActivityGalleryEntityList) ? oldActivityGalleryEntityList.get(oldActivityGalleryEntityList.size() - 1).getLineNumber() + 1 : 1;

        List<ActivityGalleryEntity> newActivityGalleryEntityList = new ArrayList<>();
        for (MultipartFile file : files) {
            String contentUrl = this.uploadAmazonS3(activityEntity.getId(), file.getBytes());
            ActivityGalleryEntity entity = new ActivityGalleryEntity();
            entity.setActivityId(activityId);
            entity.setLineNumber(lineNumber++);
            entity.setContentUrl(contentUrl);
            newActivityGalleryEntityList.add(entity);
        }
        repository.saveAll(newActivityGalleryEntityList);
        this.updateActivityContentUrl(activityEntity);
        return Boolean.TRUE;
    }

    @Override
    public ActivityGalleryModel updateContent(Long id, MultipartFile file) throws IOException {
        ActivityGalleryEntity activityGalleryEntity = repository.getReferenceById(id);
        amazonS3ClientService.deleteContentByUrl(activityGalleryEntity.getContentUrl());

        ActivityEntity activityEntity = activityRepository.getReferenceById(activityGalleryEntity.getActivityId());
        String contentUrl = this.uploadAmazonS3(activityEntity.getId(), file.getBytes());

        activityGalleryEntity.setContentUrl(contentUrl);
        ActivityGalleryModel activityGalleryModel = converter.convertToModel(repository.save(activityGalleryEntity));
        this.updateActivityContentUrl(activityEntity);
        return activityGalleryModel;
    }

    @Override
    public ActivityGalleryModel save(ActivityGalleryModel model) {
        ActivityGalleryModel activityGalleryModel = converter.convertToModel(repository.save(converter.convertToEntity(model)));
        this.updateActivityContentUrl(activityGalleryModel.getActivityId());
        return activityGalleryModel;
    }

    @Override
    public void deleteById(Long id) {
        ActivityGalleryEntity entity = repository.getReferenceById(id);
        amazonS3ClientService.deleteContentByUrl(entity.getContentUrl());
        this.updateActivityContentUrl(entity.getActivityId());
        repository.deleteById(id);
    }

    @Override
    public ActivityGalleryModel getById(Long id) {
        return converter.convertToModel(repository.getReferenceById(id));
    }

    @Override
    public List<ActivityGalleryModel> getListByActivityId(Long activityId) {
        return converter.convertToModelList(repository.getByActivityIdOrderByLineNumber(activityId));
    }

    private void updateActivityContentUrl(Long activityId) {
        ActivityEntity activityEntity = activityRepository.getReferenceById(activityId);
        this.updateActivityContentUrl(activityEntity);
    }

    private void updateActivityContentUrl(ActivityEntity activityEntity) {
        List<ActivityGalleryEntity> entityList = repository.getByActivityIdOrderByLineNumber(activityEntity.getId());
        String contentUrl = entityList.get(0).getContentUrl();
        if (!contentUrl.equals(activityEntity.getContentUrl())) {
            activityEntity.setContentUrl(contentUrl);
            activityRepository.save(activityEntity);
        }
    }

    private String uploadAmazonS3(Long activityId, byte[] content) {
        AmazonS3FileUploadModel uploadModel = new AmazonS3FileUploadModel();
        uploadModel.setFolderName("activity/" + activityId);
        uploadModel.setFileName(UUID.randomUUID() + ".jpg");
        uploadModel.setContent(content);
        return this.amazonS3ClientService.uploadContent(uploadModel);
    }

}