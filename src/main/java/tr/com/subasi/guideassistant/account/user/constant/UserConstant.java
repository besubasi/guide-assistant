package tr.com.subasi.guideassistant.account.user.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface UserConstant extends CommonConstant {

    String REQUEST_MAPPING = "/account/user";
    String TABLE_NAME = "USER";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_USER_NAME = "USER_NAME";
    String COLUMN_PASSWORD = "PASSWORD";
    String COLUMN_PHONE_NUMBER = "PHONE_NUMBER";
    String COLUMN_EMAIL = "EMAIL";
    String COLUMN_LANGUAGE_ID = "LANGUAGE_ID";
    String COLUMN_REFERENCE_USER_ID = "REFERENCE_USER_ID";
}
