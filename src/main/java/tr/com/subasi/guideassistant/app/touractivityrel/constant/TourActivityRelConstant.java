package tr.com.subasi.guideassistant.app.touractivityrel.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TourActivityRelConstant extends CommonConstant {

    String REQUEST_MAPPING = "/tour-activity-rel";
    String TABLE_NAME = "TOUR_ACTIVITY_REL";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TOUR_ID = "TOUR_ID";
    String COLUMN_ACTIVITY_ID = "ACTIVITY_ID";
    String COLUMN_DAY_NUMBER = "DAY_NUMBER";
    String COLUMN_LINE_NUMBER = "LINE_NUMBER";
    String COLUMN_ACTIVITY_COMPANY_ID = "ACTIVITY_COMPANY_ID";

    String FK_TOUR_ACTIVITY_REL_TO_TOUR = "FK_TOUR_ACTIVITY_REL_TO_TOUR";
    String FK_TOUR_ACTIVITY_REL_TO_ACTIVITY = "FK_TOUR_ACTIVITY_REL_TO_ACTIVITY";
    String FK_TOUR_ACTIVITY_REL_TO_ACTIVITY_COMPANY = "FK_TOUR_ACTIVITY_REL_TO_ACTIVITY_COMPANY";

}
