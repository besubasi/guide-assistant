package tr.com.subasi.guideassistant.app.tourcategory.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TourCategoryConstant extends CommonConstant {


    String REQUEST_MAPPING = "/tour-category";

    String TABLE_NAME = "TOUR_CATEGORY";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_COMPANY_ID = "COMPANY_ID";

    String FK_TOUR_CATEGORY_TO_COMPANY = "FK_TOUR_CATEGORY_TO_COMPANY";

}
