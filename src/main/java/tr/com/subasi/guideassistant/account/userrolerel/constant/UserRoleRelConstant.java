package tr.com.subasi.guideassistant.account.userrolerel.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface UserRoleRelConstant extends CommonConstant {

    String REQUEST_MAPPING = "/account/user-role-rel";
    String TABLE_NAME = "USER_ROLE_REL";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_USER_ID = "USER_ID";
    String COLUMN_ROLE_ID = "ROLE_ID";

}
