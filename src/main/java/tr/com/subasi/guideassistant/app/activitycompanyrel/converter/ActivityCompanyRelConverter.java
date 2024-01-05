package tr.com.subasi.guideassistant.app.activitycompanyrel.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.activitycompanyrel.entity.ActivityCompanyRelEntity;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ActivityCompanyRelConverter extends BaseMapper<ActivityCompanyRelModel, ActivityCompanyRelEntity> {

}
