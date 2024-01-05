package tr.com.subasi.guideassistant.app.tourcategory.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourcategory.converter.TourCategoryConverter;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategoryModel;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySearchModel;
import tr.com.subasi.guideassistant.app.tourcategory.repository.TourCategoryRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class TourCategoryServiceImpl extends BaseServiceImpl<TourCategoryModel, TourCategorySearchModel, TourCategoryEntity, TourCategoryRepository, TourCategoryConverter> implements tr.com.subasi.guideassistant.app.tourcategory.service.TourCategoryService {
    public TourCategoryServiceImpl(TourCategoryRepository repository, TourCategoryConverter converter) {
        super(repository, converter);
    }
}
