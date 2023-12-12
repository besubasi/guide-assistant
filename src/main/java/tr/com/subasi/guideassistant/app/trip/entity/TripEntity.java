package tr.com.subasi.guideassistant.app.trip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;

import java.time.LocalDate;

import static tr.com.subasi.guideassistant.app.trip.constant.TripConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@SequenceGenerator(name = SEQUENCE_GENERATOR, sequenceName = TABLE_SEQ_NAME, allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class TripEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_CODE)
    private String code;

    @NotNull
    @Column(name = COLUMN_TOUR_ID)
    private Long tourId;

    @NotNull
    @Column(name = COLUMN_FIRST_GUIDE_USER_ID)
    private Long firstGuideUserId;

    @Column(name = COLUMN_SECOND_GUIDE_USER_ID)
    private Long secondGuideUserId;

    @NotNull
    @Column(name = COLUMN_START_DATE)
    private LocalDate startDate;

    @NotNull
    @Column(name = COLUMN_DAY)
    private Integer day;

}
