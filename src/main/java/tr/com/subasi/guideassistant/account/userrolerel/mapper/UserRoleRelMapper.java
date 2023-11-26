package tr.com.subasi.guideassistant.account.userrolerel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.account.userrolerel.entity.UserRoleRelEntity;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserRoleRelMapper extends BaseMapper<UserRoleRelModel, UserRoleRelEntity> {

}
