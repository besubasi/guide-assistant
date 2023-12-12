package tr.com.subasi.guideassistant.app.tripactivitypricing.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TripActivityPricingConstant extends CommonConstant {

    String REQUEST_MAPPING = "/guide/trip-activity-pricing";

    String TABLE_NAME = "TRIP_ACTIVITY_PRICING";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TRIP_ACTIVITY_ID = "TRIP_ACTIVITY_ID";
    String COLUMN_PRICING_TYPE_ID = "PRICING_TYPE_ID";
    String COLUMN_AMOUNT = "AMOUNT";
    String COLUMN_CURRENCY_ID = "CURRENCY_ID";

}
