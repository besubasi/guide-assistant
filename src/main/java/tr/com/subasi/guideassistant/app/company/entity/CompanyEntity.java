package tr.com.subasi.guideassistant.app.company.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.district.entity.DistrictEntity;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.company.constant.CompanyConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class CompanyEntity extends IdEntity {

    @NotBlank
    @Column(name = COLUMN_CODE)
    private String code;

    @NotBlank
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_COUNTRY_ID)
    private Long countryId;

    @NotNull
    @Column(name = COLUMN_CITY_ID)
    private Long cityId;

    @NotNull
    @Column(name = COLUMN_DISTRICT_ID)
    private Long districtId;

    @Column(name = COLUMN_ADDRESS)
    private String address;

    @Column(name = COLUMN_WEBSITE_URL)
    private String websiteUrl;

    @Column(name = COLUMN_IMAGE_URL)
    private String imageUrl;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private boolean active;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_COUNTRY_ID, foreignKey = @ForeignKey(name = FK_COMPANY_TO_COUNTRY), insertable = false, updatable = false)
    private CountryEntity country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_CITY_ID, foreignKey = @ForeignKey(name = FK_COMPANY_TO_CITY), insertable = false, updatable = false)
    private CityEntity city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_DISTRICT_ID, foreignKey = @ForeignKey(name = FK_COMPANY_TO_DISTRICT), insertable = false, updatable = false)
    private DistrictEntity district;

}
