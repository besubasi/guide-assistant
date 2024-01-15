package tr.com.subasi.guideassistant.common.model;


import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tr.com.subasi.guideassistant.common.util.SortUtil;

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class BaseSearchModel extends IdModel {

    private Pageable pageable = SortUtil.getDefaultPageable();

}