package tr.com.subasi.guideassistant.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Page<T> implements Serializable {

    private transient List<T> data;
    private Long totalElements;
    private Integer totalPages;
    private Pageable pageable;

    public Page() {
    }

    public Page(List<T> data, Pageable pageable) {
        this.data = data;
        this.pageable = pageable;
    }

    public Page(List<T> data, Long totalElements, Integer totalPages, Pageable pageable) {
        this(data, pageable);
        this.totalElements = totalElements;
        this.totalPages = totalPages;
    }
}
