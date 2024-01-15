package tr.com.subasi.guideassistant.common.model;

import lombok.Data;
import org.springframework.data.domain.Sort.Direction;

@Data
public class Sort {

    private static final String DEFAULT_PROPERTY = "id";

    private String property;
    private Direction direction;


    public Sort() {
        this.property = DEFAULT_PROPERTY;
        this.direction = Direction.ASC;
    }

}
