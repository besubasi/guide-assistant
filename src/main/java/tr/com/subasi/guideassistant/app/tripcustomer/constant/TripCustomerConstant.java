package tr.com.subasi.guideassistant.app.tripcustomer.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TripCustomerConstant extends CommonConstant {

    String REQUEST_MAPPING = "/guide/trip-customer";

    String TABLE_NAME = "TRIP_CUSTOMER";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TRIP_ID = "TRIP_ID";
    String COLUMN_USER_ID = "USER_ID";

    String COLUMN_RELATION_USER_ID = "RELATION_USER_ID";
    String COLUMN_PRICING_TYPE_ID = "PRICING_TYPE_ID";
    String COLUMN_IS_NEGATIVE_BALANCE = "IS_NEGATIVE_BALANCE";

}
