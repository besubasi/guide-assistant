package tr.com.subasi.guideassistant.account.roleauthorityrel.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface RoleAuthorityRelConstant extends CommonConstant {

    String REQUEST_MAPPING = "/account/role-authority-rel";
    String TABLE_NAME = "ROLE_AUTHORITY_REL";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_ROLE_ID = "ROLE_ID";
    String COLUMN_AUTHORITY_ID = "AUTHORITY_ID";

}
