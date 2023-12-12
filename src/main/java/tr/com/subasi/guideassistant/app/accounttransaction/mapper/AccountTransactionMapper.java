package tr.com.subasi.guideassistant.app.accounttransaction.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.accounttransaction.entity.AccountTransactionEntity;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountTransactionMapper extends BaseMapper<AccountTransactionModel, AccountTransactionEntity> {
}

