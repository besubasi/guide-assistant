package tr.com.subasi.guideassistant.common.model;


import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseSearchModel {

    private Long id;
}