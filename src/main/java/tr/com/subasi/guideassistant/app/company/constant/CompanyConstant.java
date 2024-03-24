package tr.com.subasi.guideassistant.app.company.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface CompanyConstant extends CommonConstant {


    String REQUEST_MAPPING = "/company";
    String TABLE_NAME = "COMPANY";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_COUNTRY_ID = "COUNTRY_ID";
    String COLUMN_CITY_ID = "CITY_ID";
    String COLUMN_DISTRICT_ID = "DISTRICT_ID";
    String COLUMN_ADDRESS = "ADDRESS";
    String COLUMN_WEBSITE_URL = "WEBSITE_URL";
    String COLUMN_IMAGE_URL = "IMAGE_URL";

    String FK_COMPANY_TO_COUNTRY = "FK_COMPANY_TO_COUNTRY";
    String FK_COMPANY_TO_CITY = "FK_COMPANY_TO_CITY";
    String FK_COMPANY_TO_DISTRICT = "FK_COMPANY_TO_DISTRICT";
}
