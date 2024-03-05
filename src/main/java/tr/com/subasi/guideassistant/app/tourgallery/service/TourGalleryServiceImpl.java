package tr.com.subasi.guideassistant.app.tourgallery.service;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepository;
import tr.com.subasi.guideassistant.app.tourgallery.converter.TourGalleryConverter;
import tr.com.subasi.guideassistant.app.tourgallery.entity.TourGalleryEntity;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryContentUpdateModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.app.tourgallery.repository.TourGalleryRepository;
import tr.com.subasi.guideassistant.integration.model.AmazonS3FileUploadModel;
import tr.com.subasi.guideassistant.integration.service.AmazonS3ClientService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TourGalleryServiceImpl implements TourGalleryService {

    private final TourGalleryRepository repository;
    private final TourGalleryConverter converter;
    private final TourRepository tourRepository;
    private final AmazonS3ClientService amazonS3ClientService;

    public TourGalleryServiceImpl(TourGalleryRepository repository,
                                  TourGalleryConverter converter,
                                  TourRepository tourRepository,
                                  AmazonS3ClientService amazonS3ClientService) {
        this.repository = repository;
        this.converter = converter;
        this.tourRepository = tourRepository;
        this.amazonS3ClientService = amazonS3ClientService;
    }

    @Override
    public Boolean createFiles(Long tourId, MultipartFile[] files) throws IOException {
        TourEntity tourEntity = tourRepository.getReferenceById(tourId);
        List<TourGalleryEntity> oldTourGalleryEntityList = repository.getByTourIdOrderByLineNumber(tourEntity.getId());
        int lineNumber = CollectionUtils.isNotEmpty(oldTourGalleryEntityList) ? oldTourGalleryEntityList.get(oldTourGalleryEntityList.size()-1).getLineNumber()+1 : 1;

        List<TourGalleryEntity> newTourGalleryEntityList = new ArrayList<>();
        for (MultipartFile file : files) {
            String contentUrl = this.uploadAmazonS3(tourEntity.getCompanyId(), tourEntity.getId(), file.getBytes());
            TourGalleryEntity entity = new TourGalleryEntity();
            entity.setTourId(tourId);
            entity.setLineNumber(lineNumber++);
            entity.setContentUrl(contentUrl);
            newTourGalleryEntityList.add(entity);
        }
        repository.saveAll(newTourGalleryEntityList);

        tourEntity.setPremierContentUrl(CollectionUtils.isNotEmpty(oldTourGalleryEntityList) ? oldTourGalleryEntityList.get(0).getContentUrl() : newTourGalleryEntityList.get(0).getContentUrl());
        tourRepository.save(tourEntity);
        return Boolean.TRUE;
    }

    @Override
    public TourGalleryModel update(TourGalleryModel model) {
        TourEntity tourEntity = tourRepository.getReferenceById(model.getTourId());
        TourGalleryModel tourGalleryModel = converter.convertToModel(repository.save(converter.convertToEntity(model)));
        this.updateTourPremierContentUrl(tourEntity);
        return tourGalleryModel;
    }

    @Override
    public TourGalleryModel updateContent(TourGalleryContentUpdateModel model) {
        TourGalleryModel tourGalleryModel = converter.convertToModel(repository.getReferenceById(model.getId()));
        amazonS3ClientService.updateContentByUrl(tourGalleryModel.getContentUrl(), model.getContent().getBytes());
        return tourGalleryModel;
    }

    @Override
    public void deleteById(Long id) {
        TourGalleryEntity entity = repository.getReferenceById(id);
        amazonS3ClientService.deleteContentByUrl(entity.getContentUrl());
        repository.deleteById(id);
    }

    @Override
    public TourGalleryModel getById(Long id) {
        return converter.convertToModel(repository.getReferenceById(id));
    }

    @Override
    public List<TourGalleryModel> getListByTourId(Long tourId) {
        return converter.convertToModelList(repository.getByTourIdOrderByLineNumber(tourId));
    }

    private void updateTourPremierContentUrl(TourEntity tourEntity) {
        List<TourGalleryEntity> entityList = repository.getByTourIdOrderByLineNumber(tourEntity.getId());
        tourEntity.setPremierContentUrl(entityList.get(0).getContentUrl());
        tourRepository.save(tourEntity);
    }


    private String uploadAmazonS3(Long companyId, Long tourId, byte[] content) {
        AmazonS3FileUploadModel uploadModel = new AmazonS3FileUploadModel();
        uploadModel.setFolderName(companyId + "/tour/" + tourId);
        uploadModel.setFileName(UUID.randomUUID() + ".jpg");
        uploadModel.setContent(content);
        return this.amazonS3ClientService.uploadContent(uploadModel);
    }

}