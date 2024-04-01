package tr.com.subasi.guideassistant.app.tripactivity.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activitycompany.entity.ActivityCompanyEntity;
import tr.com.subasi.guideassistant.app.trip.entity.TripEntity;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.tripactivity.constant.TripActivityConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class TripActivityEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_TRIP_ID)
    private Long tripId;

    @NotNull
    @Column(name = COLUMN_ACTIVITY_ID)
    private Long activityId;

    @NotNull
    @Column(name = COLUMN_DAY_NUMBER)
    private Short dayNumber;

    @NotNull
    @Column(name = COLUMN_LINE_NUMBER)
    private Short lineNumber;

    @Column(name = COLUMN_ESTIMATED_TIME)
    private String estimatedTime;

    @Column(name = COLUMN_ACTIVITY_COMPANY_ID)
    private Long activityCompanyId;

    @NotNull
    @Column(name = COLUMN_IS_EXTRA)
    private Boolean extra = Boolean.FALSE;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_TRIP_ID, foreignKey = @ForeignKey(name = FK_TRIP_ACTIVITY_TO_TRIP), insertable = false, updatable = false)
    private TripEntity trip;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_ACTIVITY_ID, foreignKey = @ForeignKey(name = FK_TRIP_ACTIVITY_TO_ACTIVITY), insertable = false, updatable = false)
    private ActivityEntity activity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_ACTIVITY_COMPANY_ID, foreignKey = @ForeignKey(name = FK_TRIP_ACTIVITY_TO_ACTIVITY_COMPANY), insertable = false, updatable = false)
    private ActivityCompanyEntity activityCompany;


}
