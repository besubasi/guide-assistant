package tr.com.subasi.guideassistant.app.activitygallery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;


import static tr.com.subasi.guideassistant.app.activitygallery.constant.ActivityGalleryConstant.*;
import static tr.com.subasi.guideassistant.app.activitygallery.constant.ActivityGalleryConstant.COLUMN_CONTENT_URL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
public class ActivityGalleryEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_ACTIVITY_ID)
    private Long activityId;

    @NotNull
    @Column(name = COLUMN_CONTENT_URL)
    private String contentUrl;

    @NotNull
    @Column(name = COLUMN_PREMIER)
    private Boolean premier = Boolean.FALSE;

    @NotNull
    @Column(name = COLUMN_LINE_NUMBER)
    private Integer lineNumber;

    @Column(name = COLUMN_DESCRIPTION)
    private String description;

}