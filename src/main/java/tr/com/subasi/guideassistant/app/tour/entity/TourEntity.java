package tr.com.subasi.guideassistant.app.tour.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.tour.constant.TourConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME, uniqueConstraints = {@UniqueConstraint(name = UX_TOUR_CODE, columnNames = {COLUMN_CODE})})
@EqualsAndHashCode(callSuper = true)
public class TourEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_COMPANY_ID)
    private Long companyId;

    @NotNull
    @Column(name = COLUMN_TOUR_TYPE_ID)
    private Long tourTypeId;

    @NotNull
    @Column(name = COLUMN_CODE)
    private String code;

    @NotBlank
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_DAY)
    private Integer day;

    @Column(name = COLUMN_CONTENT_URL)
    private String contentUrl;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private Boolean active = Boolean.TRUE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_COMPANY_ID, foreignKey = @ForeignKey(name = FK_TOUR_TO_COMPANY), insertable = false, updatable = false)
    private CompanyEntity company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_TOUR_TYPE_ID, foreignKey = @ForeignKey(name = FK_TOUR_TO_TOUR_TYPE), insertable = false, updatable = false)
    private TourTypeEntity tourType;

}
