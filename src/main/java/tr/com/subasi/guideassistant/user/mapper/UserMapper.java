package tr.com.subasi.guideassistant.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.common.BaseMapper;
import tr.com.subasi.guideassistant.user.entity.UserEntity;
import tr.com.subasi.guideassistant.user.model.UserModel;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends BaseMapper<UserModel, UserEntity> {
}
