package tr.com.subasi.guideassistant.app.activitygallery.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import static tr.com.subasi.guideassistant.app.activity.constant.ActivityConstant.FK_ACTIVITY_GALLERY_TO_ACTIVITY;
import static tr.com.subasi.guideassistant.app.activitygallery.constant.ActivityGalleryConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
public class ActivityGalleryEntity extends IdEntity {

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


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COLUMN_ACTIVITY_ID, foreignKey = @ForeignKey(name = FK_ACTIVITY_GALLERY_TO_ACTIVITY), insertable = false, updatable = false)
    private ActivityEntity activity;

}