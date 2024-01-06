package tr.com.subasi.guideassistant.account.authority.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.account.authority.entity.AuthorityEntity;
import tr.com.subasi.guideassistant.account.authority.model.AuthorityModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AuthorityConverter extends BaseConverter<AuthorityModel, AuthorityEntity> {

}
