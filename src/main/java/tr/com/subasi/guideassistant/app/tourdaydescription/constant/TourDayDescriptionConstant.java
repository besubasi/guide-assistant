package tr.com.subasi.guideassistant.app.tourdaydescription.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TourDayDescriptionConstant extends CommonConstant {


    String REQUEST_MAPPING = "/guide/tour-day-description";

    String TABLE_NAME = "TOUR_DAY_DESCRIPTION";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TOUR_ID = "TOUR_ID";
    String COLUMN_DAY_NUMBER = "DAY_NUMBER";

}
