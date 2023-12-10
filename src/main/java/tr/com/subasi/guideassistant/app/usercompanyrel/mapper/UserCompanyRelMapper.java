package tr.com.subasi.guideassistant.app.usercompanyrel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.usercompanyrel.entity.UserCompanyRelEntity;
import tr.com.subasi.guideassistant.app.usercompanyrel.model.UserCompanyRelModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserCompanyRelMapper extends BaseMapper<UserCompanyRelModel, UserCompanyRelEntity> {

}
