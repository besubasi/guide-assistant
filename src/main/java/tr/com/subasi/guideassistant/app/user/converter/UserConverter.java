package tr.com.subasi.guideassistant.app.user.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.user.GuideUserModel;
import tr.com.subasi.guideassistant.app.user.entity.UserEntity;
import tr.com.subasi.guideassistant.app.user.model.UserModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserConverter extends BaseConverter<UserModel, UserEntity> {

    GuideUserModel convertToGuideUserModel(UserEntity entity);

    UserEntity convertToEntityByGuideUser(GuideUserModel model);

}
