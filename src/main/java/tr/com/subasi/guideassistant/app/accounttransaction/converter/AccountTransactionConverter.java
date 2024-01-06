package tr.com.subasi.guideassistant.app.accounttransaction.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.accounttransaction.entity.AccountTransactionEntity;
import tr.com.subasi.guideassistant.app.accounttransaction.model.AccountTransactionModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountTransactionConverter extends BaseConverter<AccountTransactionModel, AccountTransactionEntity> {
}

