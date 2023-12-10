package tr.com.subasi.guideassistant.app.tourcategory.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourcategory.mapper.TourCategoryMapper;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategoryModel;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySearchModel;
import tr.com.subasi.guideassistant.app.tourcategory.repository.TourCategoryRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class TourCategoryServiceImpl extends GenericServiceImpl<TourCategoryModel, TourCategorySearchModel, TourCategoryEntity> implements tr.com.subasi.guideassistant.app.tourcategory.service.TourCategoryService {
    public TourCategoryServiceImpl(TourCategoryRepository repository, TourCategoryMapper mapper) {
        super(repository, mapper);
    }
}
