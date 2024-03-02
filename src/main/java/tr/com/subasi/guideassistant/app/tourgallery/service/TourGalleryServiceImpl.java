package tr.com.subasi.guideassistant.app.tourgallery.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepository;
import tr.com.subasi.guideassistant.app.tourgallery.converter.TourGalleryConverter;
import tr.com.subasi.guideassistant.app.tourgallery.entity.TourGalleryEntity;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryContentUpdateModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryCreateModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryUpdateModel;
import tr.com.subasi.guideassistant.app.tourgallery.repository.TourGalleryRepository;
import tr.com.subasi.guideassistant.integration.model.AmazonS3FileUploadModel;
import tr.com.subasi.guideassistant.integration.service.AmazonS3ClientService;

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
    public List<TourGalleryModel> createAll(List<TourGalleryCreateModel> modelList) {
        TourEntity tourEntity = tourRepository.getReferenceById(modelList.get(0).getTourId());

        for (TourGalleryCreateModel model : modelList) {
            String contentUrl = this.uploadAmazonS3(tourEntity.getCompanyId(), tourEntity.getId(), model.getContent().getBytes());

            TourGalleryEntity tourGalleryEntity = converter.convertToEntityByCreateModel(model);
            tourGalleryEntity.setContentUrl(contentUrl);
            repository.save(tourGalleryEntity);
        }

        List<TourGalleryEntity> entityList = repository.getByTourIdOrderByLineNumber(tourEntity.getId());
        tourEntity.setPremierContentUrl(entityList.get(0).getContentUrl());
        tourRepository.save(tourEntity);

        return converter.convertToModelList(entityList);
    }

    @Override
    public TourGalleryModel create(TourGalleryCreateModel model) {
        TourEntity tourEntity = tourRepository.getReferenceById(model.getTourId());

        String contentUrl = this.uploadAmazonS3(tourEntity.getCompanyId(), tourEntity.getId(), model.getContent().getBytes());

        TourGalleryEntity tourGalleryEntity = converter.convertToEntityByCreateModel(model);
        tourGalleryEntity.setContentUrl(contentUrl);

        TourGalleryModel tourGalleryModel = converter.convertToModel(repository.save(tourGalleryEntity));
        this.updateTourPremierContentUrl(tourEntity);
        return tourGalleryModel;
    }

    @Override
    public TourGalleryModel update(TourGalleryUpdateModel model) {
        TourEntity tourEntity = tourRepository.getReferenceById(model.getTourId());
        TourGalleryModel tourGalleryModel = converter.convertToModel(repository.save(converter.convertToEntityByUpdateModel(model)));
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