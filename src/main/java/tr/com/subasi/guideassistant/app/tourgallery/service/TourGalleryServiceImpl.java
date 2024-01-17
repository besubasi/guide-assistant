package tr.com.subasi.guideassistant.app.tourgallery.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourgallery.converter.TourGalleryConverter;
import tr.com.subasi.guideassistant.app.tourgallery.entity.TourGalleryEntity;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGallerySearchModel;
import tr.com.subasi.guideassistant.app.tourgallery.repository.TourGalleryRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TourGalleryServiceImpl extends BaseServiceImpl<TourGalleryModel, TourGallerySearchModel, TourGalleryEntity, TourGalleryRepositoryImpl, TourGalleryConverter> implements TourGalleryService {

    public TourGalleryServiceImpl(TourGalleryRepositoryImpl repository, TourGalleryConverter converter) {
        super(repository, converter);
    }
}