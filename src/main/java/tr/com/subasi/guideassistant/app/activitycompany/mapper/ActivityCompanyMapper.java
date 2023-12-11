package tr.com.subasi.guideassistant.app.activitycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.activitycompany.entity.ActivityCompanyEntity;
import tr.com.subasi.guideassistant.app.activitycompany.model.ActivityCompanyModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ActivityCompanyMapper extends BaseMapper<ActivityCompanyModel, ActivityCompanyEntity> {
}

