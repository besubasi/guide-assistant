package tr.com.subasi.guideassistant.account.roleauthorityrel.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.account.roleauthorityrel.entity.RoleAuthorityRelEntity;
import tr.com.subasi.guideassistant.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleAuthorityRelConverter extends BaseMapper<RoleAuthorityRelModel, RoleAuthorityRelEntity> {

}
