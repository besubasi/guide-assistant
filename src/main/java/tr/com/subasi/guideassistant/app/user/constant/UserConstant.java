package tr.com.subasi.guideassistant.app.user.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface UserConstant extends CommonConstant {

    String REQUEST_MAPPING = "/user";
    String TABLE_NAME = "USER";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_USER_NAME = "USER_NAME";
    String COLUMN_NAME = "NAME";
    String COLUMN_SURNAME = "SURNAME";
    String COLUMN_EMAIL = "EMAIL";
    String COLUMN_PHONE_NUMBER = "PHONE_NUMBER";
}
