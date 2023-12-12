package tr.com.subasi.guideassistant.app.trip.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TripConstant extends CommonConstant {

    String REQUEST_MAPPING = "/guide/trip";

    String TABLE_NAME = "TRIP";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TOUR_ID = "TOUR_ID";
    String COLUMN_FIRST_GUIDE_USER_ID = "FIRST_GUIDE_USER_ID";
    String COLUMN_SECOND_GUIDE_USER_ID = "SECOND_GUIDE_USER_ID";
    String COLUMN_START_DATE = "START_DATE";
    String COLUMN_DAY = "DAY";
}
