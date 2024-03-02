package tr.com.subasi.guideassistant.app.tour.service;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.Tuple;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tour.converter.TourConverter;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSaveModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepository;
import tr.com.subasi.guideassistant.app.tour.repository.TourRepositoryImpl;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.util.SortUtil;
import tr.com.subasi.guideassistant.integration.model.AmazonS3FileUploadModel;
import tr.com.subasi.guideassistant.integration.service.AmazonS3ClientService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TourServiceImpl implements TourService {

    protected static final Logger LOGGER = LoggerFactory.getLogger(TourServiceImpl.class);

    private final TourRepository repository;
    private final TourConverter converter;
    private final AmazonS3ClientService amazonS3ClientService;

    public TourServiceImpl(TourRepositoryImpl repository, TourConverter converter, AmazonS3ClientService amazonS3ClientService) {
        this.repository = repository;
        this.converter = converter;
        this.amazonS3ClientService = amazonS3ClientService;
    }

    @Override
    public TourSaveModel save(TourSaveModel model) {
        if (model.getId() == null) {
            if (StringUtils.isEmpty(model.getPremierContentUrl()) && model.getContent() != null) {
                TourEntity tourEntity = this.repository.save(this.converter.convertToEntity(model));
                String url = this.uploadAmazonS3(model.getCompanyId(), tourEntity.getId(), model.getContent());
                tourEntity.setPremierContentUrl(url);
                return converter.convertToModel(this.repository.save(tourEntity));
            } else {
                return converter.convertToModel(this.repository.save(this.converter.convertToEntity(model)));
            }
        } else {
            return converter.convertToModel(this.repository.save(this.converter.convertToEntity(model)));
        }
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public TourModel getById(Long id) {
        return this.converter.convertToModel(repository.getReferenceById(id));
    }

    @Override
    public List<TourModel> getList(TourSearchModel searchModel) {
        LOGGER.info("SM : " + searchModel);
        return this.convertToModel(repository.getList(searchModel));
    }

    @Override
    public Page<TourModel> getPage(TourSearchModel searchModel) {
        LOGGER.info("SM : " + searchModel);
        org.springframework.data.domain.Page<TourEntity> page = repository.findAll(SortUtil.convertToPageRequest(searchModel.getPageable()));
        return new Page<>(converter.convertToModelList(page.getContent()), page.getTotalElements(), page.getTotalPages(), searchModel.getPageable());
    }

    private List<TourModel> convertToModel(List<Tuple> tupleList) {
        List<TourModel> tourModelList = new ArrayList<>();
        CollectionUtils.emptyIfNull(tupleList).forEach(tuple ->
                tourModelList.add(this.convertToModel(tuple))
        );
        return tourModelList;
    }

    private TourModel convertToModel(Tuple tuple) {
        TourEntity tourEntity = tuple.get(0, TourEntity.class);
        TourModel tourModel = converter.convertToModel(tourEntity);
        tourModel.setCompanyCode(tuple.get("companyCode", String.class));
        tourModel.setCompanyName(tuple.get("companyName", String.class));
        tourModel.setTourTypeName(tuple.get("tourTypeName", String.class));
        tourModel.setTourCategoryName(tuple.get("tourCategoryName", String.class));
        return tourModel;
    }

    private String uploadAmazonS3(Long companyId, Long tourId, byte[] content) {
        AmazonS3FileUploadModel uploadModel = new AmazonS3FileUploadModel();
        uploadModel.setFolderName(companyId + "/tour/" + tourId);
        uploadModel.setFileName(UUID.randomUUID() + ".jpg");
        uploadModel.setContent(content);
        return this.amazonS3ClientService.uploadContent(uploadModel);
    }
}
