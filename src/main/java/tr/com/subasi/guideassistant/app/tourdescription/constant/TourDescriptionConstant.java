package tr.com.subasi.guideassistant.app.tourdescription.constant;

import tr.com.subasi.guideassistant.common.constant.CommonConstant;

public interface TourDescriptionConstant extends CommonConstant {


    String REQUEST_MAPPING = "/guide/tour-description";

    String TABLE_NAME = "TOUR_DESCRIPTION";
    String TABLE_SEQ_NAME = TABLE_NAME + SEQUENCE_SUFFIX;

    String COLUMN_TOUR_ID = "TOUR_ID";
    String COLUMN_DESCRIPTION_FIRST = "DESCRIPTION_FIRST";
    String COLUMN_DESCRIPTION_SECOND = "DESCRIPTION_SECOND";

}
