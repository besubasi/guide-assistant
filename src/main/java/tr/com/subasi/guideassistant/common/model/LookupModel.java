package tr.com.subasi.guideassistant.common.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public class LookupModel extends IdModel{

    private String name;
}
