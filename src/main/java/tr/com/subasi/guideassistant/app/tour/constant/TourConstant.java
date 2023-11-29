package tr.com.subasi.guideassistant.app.tour.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TourConstant extends CommonConstant {

    String REQUEST_MAPPING = "/guide/tour";
    String TABLE_NAME = "TOUR";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_COMPANY_ID = "COMPANY_ID";
    String COLUMN_TOUR_TYPE_ID = "TOUR_TYPE_ID";
    String COLUMN_DAY = "DAY";
}
