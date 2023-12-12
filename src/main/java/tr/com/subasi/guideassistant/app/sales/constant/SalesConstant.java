package tr.com.subasi.guideassistant.app.sales.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface SalesConstant extends CommonConstant {


    String REQUEST_MAPPING = "/guide/sales";
    String TABLE_NAME = "SALES";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TRIP_CUSTOMER_ID = "TRIP_CUSTOMER_ID";
    String COLUMN_TRIP_ACTIVITY_ID = "TRIP_ACTIVITY_ID";
    String COLUMN_PAYMENT_TYPE_ID = "PAYMENT_TYPE_ID";
    String COLUMN_ACCOUNT_TRANSACTION_ID = "ACCOUNT_TRANSACTION_ID";
    String COLUMN_AMOUNT = "AMOUNT";
    String COLUMN_SALES_TYPE = "SALES_TYPE";
    String COLUMN_IS_VALID = "IS_VALID";
    String COLUMN_CURRENCY_ID = "CURRENCY_ID";
    String COLUMN_SERVICE_AMOUNT = "SERVICE_AMOUNT";
    String COLUMN_LOCAL_AMOUNT = "LOCAL_AMOUNT";
    String COLUMN_RELATED_SALES_ID = "RELATED_SALES_ID";

}
