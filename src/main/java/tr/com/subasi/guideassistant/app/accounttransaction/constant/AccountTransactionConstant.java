package tr.com.subasi.guideassistant.app.accounttransaction.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface AccountTransactionConstant extends CommonConstant {


    String REQUEST_MAPPING = "/guide/account-transaction";

    String TABLE_NAME = "ACCOUNT_TRANSACTION";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_ACCOUNT_ID = "ACCOUNT_ID";
    String COLUMN_TRIP_ID = "TRIP_ID";
    String COLUMN_DATE = "DATE";
    String COLUMN_AMOUNT = "AMOUNT";
    String COLUMN_CURRENCY_ID = "CURRENCY_ID";

    String COLUMN_LOCAL_AMOUNT = "LOCAL_AMOUNT";
    String COLUMN_ACCOUNT_TYPE = "ACCOUNT_TYPE";
    String COLUMN_DEBIT_TYPE = "DEBIT_TYPE";

}
