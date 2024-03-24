package tr.com.subasi.guideassistant.app.activity.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface ActivityConstant extends CommonConstant {


    String REQUEST_MAPPING = "/activity";
    String TABLE_NAME = "ACTIVITY";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_ESTIMATED_TIME = "ESTIMATED_TIME";
    String COLUMN_IS_EXTRA = "IS_EXTRA";
    String COLUMN_CONTENT_URL = "CONTENT_URL";

}
