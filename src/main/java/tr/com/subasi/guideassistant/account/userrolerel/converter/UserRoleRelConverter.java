package tr.com.subasi.guideassistant.account.userrolerel.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.account.userrolerel.entity.UserRoleRelEntity;
import tr.com.subasi.guideassistant.account.userrolerel.model.UserRoleRelModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserRoleRelConverter extends BaseConverter<UserRoleRelModel, UserRoleRelEntity> {

}
