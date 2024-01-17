package tr.com.subasi.guideassistant.app.activitygallery.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.activitygallery.converter.ActivityGalleryConverter;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGalleryModel;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGallerySearchModel;
import tr.com.subasi.guideassistant.app.activitygallery.repository.ActivityGalleryRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class ActivityGalleryServiceImpl extends BaseServiceImpl<ActivityGalleryModel, ActivityGallerySearchModel, ActivityGalleryEntity, ActivityGalleryRepositoryImpl, ActivityGalleryConverter> implements ActivityGalleryService {

    public ActivityGalleryServiceImpl(ActivityGalleryRepositoryImpl repository, ActivityGalleryConverter converter) {
        super(repository, converter);
    }
}