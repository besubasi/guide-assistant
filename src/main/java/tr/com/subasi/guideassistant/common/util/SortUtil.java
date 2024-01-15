package tr.com.subasi.guideassistant.common.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import tr.com.subasi.guideassistant.common.model.Pageable;

public class SortUtil {

    private static final Pageable DEFAULT_PAGEABLE = new Pageable();


    public static Pageable getDefaultPageable() {
        return DEFAULT_PAGEABLE;
    }

    public static PageRequest convertToPageRequest(Pageable pageable) {
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), convertToSort(pageable.getSort()));
    }

    public static Sort convertToSort(tr.com.subasi.guideassistant.common.model.Sort sort) {
        return Sort.by(sort.getDirection(), sort.getProperty());
    }


}
