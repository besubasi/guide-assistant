package tr.com.subasi.guideassistant.app.district.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.district.entity.DistrictEntity;
import tr.com.subasi.guideassistant.app.district.model.DistrictModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSaveModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter2;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DistrictConverter extends BaseConverter2<DistrictSaveModel, DistrictModel, DistrictEntity> {
}

