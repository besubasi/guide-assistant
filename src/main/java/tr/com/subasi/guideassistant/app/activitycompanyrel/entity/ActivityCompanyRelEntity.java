package tr.com.subasi.guideassistant.app.activitycompanyrel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activitycompany.entity.ActivityCompanyEntity;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.activitycompanyrel.constant.ActivityCompanyRelConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class ActivityCompanyRelEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_ACTIVITY_ID)
    private Long activityId;

    @NotNull
    @Column(name = COLUMN_ACTIVITY_COMPANY_ID)
    private Long activityCompanyId;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_ACTIVITY_ID, foreignKey = @ForeignKey(name = FK_ACTIVITY_COMPANY_REL_TO_ACTIVITY), insertable = false, updatable = false)
    private ActivityEntity activity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_ACTIVITY_COMPANY_ID, foreignKey = @ForeignKey(name = FK_ACTIVITY_COMPANY_REL_TO_ACTIVITY_COMPANY), insertable = false, updatable = false)
    private ActivityCompanyEntity activityCompany;


}
