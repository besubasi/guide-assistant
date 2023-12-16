package tr.com.subasi.guideassistant.app.tourdescription.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.tourdescription.constant.TourDescriptionConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class TourDescriptionEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_TOUR_ID)
    private Long tourId;

    @NotBlank
    @Lob
    @Column(name = COLUMN_DESCRIPTION_FIRST, columnDefinition = "text")
    private String descriptionFirst;

    @Lob
    @Column(name = COLUMN_DESCRIPTION_SECOND, columnDefinition = "text")
    private String descriptionSecond;

}
