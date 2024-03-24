package tr.com.subasi.guideassistant.app.district.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface DistrictConstant extends CommonConstant {


    String REQUEST_MAPPING = "/district";
    String TABLE_NAME = "DISTRICT";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_COUNTRY_ID = "COUNTRY_ID";
    String COLUMN_CITY_ID = "CITY_ID";

    String FK_DISTRICT_TO_COUNTRY = "FK_DISTRICT_TO_COUNTRY";
    String FK_DISTRICT_TO_CITY = "FK_DISTRICT_TO_CITY";
}
