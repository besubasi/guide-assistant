package tr.com.subasi.guideassistant.app.activitycompany.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface ActivityCompanyConstant extends CommonConstant {


    String REQUEST_MAPPING = "/guide/activity-company";

    String TABLE_NAME = "ACTIVITY_COMPANY";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_ADDRESS = "ADDRESS";
    String COLUMN_PHONE_NUMBER = "PHONE_NUMBER";
    String COLUMN_FIRST_USER = "FIRST_USER";
    String COLUMN_FIRST_USER_PHONE = "FIRST_USER_PHONE";
    String COLUMN_FIRST_USER_EMAIL = "FIRST_USER_EMAIL";
    String COLUMN_SECOND_USER = "SECOND_USER";
    String COLUMN_SECOND_USER_PHONE = "SECOND_USER_PHONE";
    String COLUMN_SECOND_USER_EMAIL = "SECOND_USER_EMAIL";

}
