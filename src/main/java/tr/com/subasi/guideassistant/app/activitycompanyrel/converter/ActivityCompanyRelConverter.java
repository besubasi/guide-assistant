package tr.com.subasi.guideassistant.app.activitycompanyrel.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.activitycompanyrel.entity.ActivityCompanyRelEntity;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelModel;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSaveModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;
import tr.com.subasi.guideassistant.common.converter.BaseConverter2;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ActivityCompanyRelConverter extends BaseConverter2<ActivityCompanyRelSaveModel, ActivityCompanyRelModel, ActivityCompanyRelEntity> {

}
