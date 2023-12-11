package tr.com.subasi.guideassistant.app.activitydescription.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.activitydescription.entity.ActivityDescriptionEntity;
import tr.com.subasi.guideassistant.app.activitydescription.model.ActivityDescriptionModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ActivityDescriptionMapper extends BaseMapper<ActivityDescriptionModel, ActivityDescriptionEntity> {
}

