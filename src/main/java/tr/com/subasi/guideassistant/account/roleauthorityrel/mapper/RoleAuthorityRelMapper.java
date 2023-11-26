package tr.com.subasi.guideassistant.account.roleauthorityrel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.account.roleauthorityrel.entity.RoleAuthorityRelEntity;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleAuthorityRelMapper extends BaseMapper<RoleAuthorityRelModel, RoleAuthorityRelEntity> {

}
