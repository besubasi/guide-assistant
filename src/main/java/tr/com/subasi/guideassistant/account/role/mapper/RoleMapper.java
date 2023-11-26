package tr.com.subasi.guideassistant.account.role.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.account.role.entity.RoleEntity;
import tr.com.subasi.guideassistant.account.role.model.RoleModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleMapper extends BaseMapper<RoleModel, RoleEntity> {

}
