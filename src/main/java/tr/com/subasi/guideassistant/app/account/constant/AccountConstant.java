package tr.com.subasi.guideassistant.app.account.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface AccountConstant extends CommonConstant {


    String REQUEST_MAPPING = "/guide/account";

    String TABLE_NAME = "ACCOUNT";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_USER_ID = "USER_ID";
    String COLUMN_AMOUNT = "AMOUNT";
    String COLUMN_CURRENCY_ID = "CURRENCY_ID";

}
