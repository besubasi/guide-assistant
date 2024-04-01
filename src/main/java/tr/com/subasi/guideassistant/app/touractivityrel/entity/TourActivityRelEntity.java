package tr.com.subasi.guideassistant.app.touractivityrel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activitycompany.entity.ActivityCompanyEntity;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.touractivityrel.constant.TourActivityRelConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class TourActivityRelEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_TOUR_ID)
    private Long tourId;

    @NotNull
    @Column(name = COLUMN_ACTIVITY_ID)
    private Long activityId;

    @NotNull
    @Column(name = COLUMN_DAY_NUMBER)
    private Short dayNumber;

    @NotNull
    @Column(name = COLUMN_LINE_NUMBER)
    private Short lineNumber;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private boolean active;

    @Column(name = COLUMN_ACTIVITY_COMPANY_ID)
    private Long activityCompanyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_TOUR_ID, foreignKey = @ForeignKey(name = FK_TOUR_ACTIVITY_REL_TO_TOUR), insertable = false, updatable = false)
    private TourEntity tour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_ACTIVITY_ID, foreignKey = @ForeignKey(name = FK_TOUR_ACTIVITY_REL_TO_ACTIVITY), insertable = false, updatable = false)
    private ActivityEntity activity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_ACTIVITY_COMPANY_ID, foreignKey = @ForeignKey(name = FK_TOUR_ACTIVITY_REL_TO_ACTIVITY_COMPANY), insertable = false, updatable = false)
    private ActivityCompanyEntity activityCompany;

}
