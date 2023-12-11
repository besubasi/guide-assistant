package tr.com.subasi.guideassistant.app.activitydescription.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;

import static tr.com.subasi.guideassistant.app.activitydescription.constant.ActivityDescriptionConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@SequenceGenerator(name = SEQUENCE_GENERATOR, sequenceName = TABLE_SEQ_NAME, allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class ActivityDescriptionEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_ACTIVITY_ID)
    private Long activityId;

    @NotBlank
    @Lob
    @Column(name = COLUMN_DESCRIPTION_FIRST, columnDefinition = "text")
    private String descriptionFirst;

    @Lob
    @Column(name = COLUMN_DESCRIPTION_SECOND, columnDefinition = "text")
    private String descriptionSecond;

}
