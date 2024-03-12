package tr.com.subasi.guideassistant.app.activity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.activity.constant.ActivityConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@EqualsAndHashCode(callSuper = true)
public class ActivityEntity extends IdEntity {

    @NotNull
    @Column(name = COLUMN_CODE)
    private String code;

    @NotNull
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_ESTIMATED_TIME)
    private String estimatedTime;

    @NotNull
    @Column(name = COLUMN_IS_EXTRA)
    private boolean extra;

    @Column(name = COLUMN_CONTENT_URL)
    private String contentUrl;

    @NotNull
    @Column(name = COLUMN_IS_ACTIVE)
    private boolean active = Boolean.TRUE;

}
