package tr.com.subasi.guideassistant.app.usercompanyrel.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface UserCompanyRelConstant extends CommonConstant {

    String REQUEST_MAPPING = "/app/user-company-rel";
    String TABLE_NAME = "USER_COMPANY_REL";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_USER_ID = "USER_ID";
    String COLUMN_COMPANY_ID = "COMPANY_ID";

}
