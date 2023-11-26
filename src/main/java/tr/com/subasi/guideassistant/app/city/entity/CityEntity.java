package tr.com.subasi.guideassistant.app.city.entity;

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

import static tr.com.subasi.guideassistant.app.city.constant.CityConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@SequenceGenerator(name = SEQUENCE_GENERATOR, sequenceName = TABLE_SEQ_NAME, allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class CityEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_COUNTRY_ID)
    private Long countryId;

    @NotNull
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private boolean isActive = true;

}
