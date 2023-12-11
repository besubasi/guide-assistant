package tr.com.subasi.guideassistant.app.activitydescription.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface ActivityDescriptionConstant extends CommonConstant {


    String REQUEST_MAPPING = "/guide/activity-description";

    String TABLE_NAME = "ACTIVITY_DESCRIPTION";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_ACTIVITY_ID = "ACTIVITY_ID";
    String COLUMN_DESCRIPTION_FIRST = "DESCRIPTION_FIRST";
    String COLUMN_DESCRIPTION_SECOND = "DESCRIPTION_SECOND";

}
