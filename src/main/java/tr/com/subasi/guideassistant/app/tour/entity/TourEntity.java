package tr.com.subasi.guideassistant.app.tour.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.tour.constant.TourConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
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

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private Boolean active = Boolean.TRUE;

}
