package tr.com.subasi.guideassistant.app.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.account.entity.AccountEntity;
import tr.com.subasi.guideassistant.app.account.model.AccountModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountMapper extends BaseMapper<AccountModel, AccountEntity> {
}

