package tr.com.subasi.guideassistant.common.model;

import lombok.Data;

@Data
public class Pageable {
    private static final int DEFAULT_PAGE_NUMBER = 0;
    private static final int DEFAULT_PAGE_SIZE = 20;

    private Integer pageNumber;
    private Integer pageSize;
    private Sort sort;

    public Pageable() {
        this.pageNumber = DEFAULT_PAGE_NUMBER;
        this.pageSize = DEFAULT_PAGE_SIZE;
        this.sort = new Sort();
    }

    public Pageable(Integer pageNumber, Integer pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sort = new Sort();
    }

    public Pageable(Integer pageNumber, Integer pageSize, Sort sort) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sort = sort;
    }
}
