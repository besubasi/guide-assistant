package tr.com.subasi.guideassistant.app.tourtype.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TourTypeConstant extends CommonConstant {


    String REQUEST_MAPPING = "/tour-type";
    String TABLE_NAME = "TOUR_TYPE";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_COMPANY_ID = "COMPANY_ID";
    String COLUMN_TOUR_CATEGORY_ID = "TOUR_CATEGORY_ID";

    String FK_TOUR_TYPE_TO_COMPANY = "FK_TOUR_TYPE_TO_COMPANY";
    String FK_TOUR_TYPE_TO_TOUR_CATEGORY = "FK_TOUR_TYPE_TO_TOUR_CATEGORY";

}
