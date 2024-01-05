package tr.com.subasi.guideassistant.app.district.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.district.entity.DistrictEntity;
import tr.com.subasi.guideassistant.app.district.converter.DistrictConverter;
import tr.com.subasi.guideassistant.app.district.model.DistrictModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;
import tr.com.subasi.guideassistant.app.district.repository.DistrictRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class DistrictServiceImpl extends BaseServiceImpl<DistrictModel, DistrictSearchModel, DistrictEntity, DistrictRepository, DistrictConverter> implements DistrictService {
    public DistrictServiceImpl(DistrictRepository repository, DistrictConverter converter) {
         super(repository, converter);
    }
}
