package tr.com.subasi.guideassistant.app.activitycompanyrel.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface ActivityCompanyRelConstant extends CommonConstant {

    String REQUEST_MAPPING = "/app/activity-company-rel";
    String TABLE_NAME = "ACTIVITY_COMPANY_REL";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_ACTIVITY_ID = "ACTIVITY_ID";
    String COLUMN_ACTIVITY_COMPANY_ID = "ACTIVITY_COMPANY_ID";

}
