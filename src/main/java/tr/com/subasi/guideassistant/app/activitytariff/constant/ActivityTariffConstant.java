package tr.com.subasi.guideassistant.app.activitytariff.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface ActivityTariffConstant extends CommonConstant {

    String REQUEST_MAPPING = "/activity-tariff";

    String TABLE_NAME = "ACTIVITY_TARIFF";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_ACTIVITY_ID = "ACTIVITY_ID";
    String COLUMN_PRICING_TYPE_ID = "PRICING_TYPE_ID";
    String COLUMN_START_DATE = "START_DATE";
    String COLUMN_AMOUNT = "AMOUNT";
    String COLUMN_CURRENCY_ID = "CURRENCY_ID";
    String COLUMN_COMMISSION_RATE = "COMMISSION_RATE";


    String FK_ACTIVITY_TARIFF_TO_ACTIVITY = "FK_ACTIVITY_TARIFF_TO_ACTIVITY";
    String FK_ACTIVITY_TARIFF_TO_PRICING_TYPE = "FK_ACTIVITY_TARIFF_TO_PRICING_TYPE";
    String FK_ACTIVITY_TARIFF_TO_CURRENCY = "FK_ACTIVITY_TARIFF_TO_CURRENCY";

}
