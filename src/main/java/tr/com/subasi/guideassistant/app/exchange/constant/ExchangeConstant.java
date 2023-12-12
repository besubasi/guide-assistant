package tr.com.subasi.guideassistant.app.exchange.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface ExchangeConstant extends CommonConstant {

    String REQUEST_MAPPING = "/guide/exchange";

    String TABLE_NAME = "EXCHANGE";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_CURRENCY_ID = "CURRENCY_ID";
    String COLUMN_DATE = "DATE";
    String COLUMN_UNIT = "UNIT";
    String COLUMN_FOREX_BUYING = "FOREX_BUYING";
    String COLUMN_FOREX_SELLING = "FOREX_SELLING";
    String COLUMN_BANKNOTE_BUYING = "BANKNOTE_BUYING";
    String COLUMN_BANKNOTE_SELLING = "BANKNOTE_SELLING";

}
