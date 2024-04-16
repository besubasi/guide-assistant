package tr.com.subasi.guideassistant.app.tripcustomer.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TripCustomerConstant extends CommonConstant {

    String REQUEST_MAPPING = "/trip-customer";

    String TABLE_NAME = "TRIP_CUSTOMER";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TRIP_ID = "TRIP_ID";
    String COLUMN_USER_ID = "USER_ID";
    String COLUMN_PHONE_NUMBER = "PHONE_NUMBER";
    String COLUMN_EMAIL = "EMAIL";
    String COLUMN_RELATION_TRIP_CUSTOMER_ID = "RELATION_TRIP_CUSTOMER_ID";
    String COLUMN_PRICING_TYPE_ID = "PRICING_TYPE_ID";
    String COLUMN_IS_NEGATIVE_BALANCE = "IS_NEGATIVE_BALANCE";
    String COLUMN_NEGATIVE_BALANCE_LIMIT = "NEGATIVE_BALANCE_LIMIT";
    String COLUMN_ACTIVATION_CODE = "ACTIVATION_CODE";

}
