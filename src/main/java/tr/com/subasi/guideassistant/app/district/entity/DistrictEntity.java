package tr.com.subasi.guideassistant.app.district.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.district.constant.DistrictConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class DistrictEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_COUNTRY_ID)
    private Long countryId;

    @NotNull
    @Column(name = COLUMN_CITY_ID)
    private Long cityId;

    @NotNull
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private Boolean active = Boolean.TRUE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_COUNTRY_ID, foreignKey = @ForeignKey(name = FK_DISTRICT_TO_COUNTRY), insertable = false, updatable = false)
    private CountryEntity country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_CITY_ID, foreignKey = @ForeignKey(name = FK_DISTRICT_TO_CITY), insertable = false, updatable = false)
    private CityEntity city;

}
