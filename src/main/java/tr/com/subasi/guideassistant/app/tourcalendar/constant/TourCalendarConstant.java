package tr.com.subasi.guideassistant.app.tourcalendar.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TourCalendarConstant extends CommonConstant {


    String REQUEST_MAPPING = "/guide/tour-calendar";

    String TABLE_NAME = "TOUR_CALENDAR";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TOUR_ID = "TOUR_ID";
    String COLUMN_START_DATE = "START_DATE";

}
