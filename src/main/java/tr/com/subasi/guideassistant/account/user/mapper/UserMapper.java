package tr.com.subasi.guideassistant.account.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.account.user.entity.UserEntity;
import tr.com.subasi.guideassistant.account.user.model.UserModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends BaseMapper<UserModel, UserEntity> {
}
