package tr.com.subasi.guideassistant.app.tripactivity.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TripActivityConstant extends CommonConstant {

    String REQUEST_MAPPING = "/trip-activity";

    String TABLE_NAME = "TRIP_ACTIVITY";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TRIP_ID = "TRIP_ID";
    String COLUMN_ACTIVITY_ID = "ACTIVITY_ID";

    String COLUMN_DAY_NUMBER = "DAY_NUMBER";
    String COLUMN_LINE_NUMBER = "LINE_NUMBER";

    String COLUMN_ACTIVITY_COMPANY_ID = "ACTIVITY_COMPANY_ID";

    String COLUMN_ESTIMATED_TIME = "ESTIMATED_TIME";
    String COLUMN_IS_EXTRA = "IS_EXTRA";

    String FK_TRIP_ACTIVITY_TO_TRIP = "FK_TRIP_ACTIVITY_TO_TRIP";
    String FK_TRIP_ACTIVITY_TO_ACTIVITY = "FK_TRIP_ACTIVITY_TO_ACTIVITY";
    String FK_TRIP_ACTIVITY_TO_ACTIVITY_COMPANY = "FK_TRIP_ACTIVITY_TO_ACTIVITY_COMPANY";


}
