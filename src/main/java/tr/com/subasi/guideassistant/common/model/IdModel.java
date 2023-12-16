package tr.com.subasi.guideassistant.common.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class IdModel {

    private Long id;

}
