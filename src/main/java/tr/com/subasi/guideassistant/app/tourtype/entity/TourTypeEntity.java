package tr.com.subasi.guideassistant.app.tourtype.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.tourtype.constant.TourTypeConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class TourTypeEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_COMPANY_ID)
    private Long companyId;

    @NotNull
    @Column(name = COLUMN_TOUR_CATEGORY_ID)
    private Long tourCategoryId;

    @NotNull
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private Boolean active = Boolean.TRUE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_COMPANY_ID, foreignKey = @ForeignKey(name = FK_TOUR_TYPE_TO_COMPANY), insertable = false, updatable = false)
    private CompanyEntity company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_TOUR_CATEGORY_ID, foreignKey = @ForeignKey(name = FK_TOUR_TYPE_TO_TOUR_CATEGORY), insertable = false, updatable = false)
    private TourCategoryEntity tourCategory;

}
