package tr.com.subasi.guideassistant.app.city.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface CityConstant extends CommonConstant {


    String REQUEST_MAPPING = "/city";
    String TABLE_NAME = "CITY";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_COUNTRY_ID = "COUNTRY_ID";

    String FK_CITY_TO_COUNTRY = "FK_CITY_TO_COUNTRY";

}
