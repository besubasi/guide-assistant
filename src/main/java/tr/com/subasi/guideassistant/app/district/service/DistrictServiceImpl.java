package tr.com.subasi.guideassistant.app.district.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.district.entity.DistrictEntity;
import tr.com.subasi.guideassistant.app.district.mapper.DistrictMapper;
import tr.com.subasi.guideassistant.app.district.model.DistrictModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;
import tr.com.subasi.guideassistant.app.district.repository.DistrictRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class DistrictServiceImpl extends GenericServiceImpl<DistrictModel, DistrictSearchModel, DistrictEntity> implements DistrictService {
    public DistrictServiceImpl(DistrictRepository repository, DistrictMapper mapper) {
        super(repository, mapper);
    }
}
