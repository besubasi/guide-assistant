package tr.com.subasi.guideassistant.app.tourgallery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;


import static tr.com.subasi.guideassistant.app.tourgallery.constant.TourGalleryConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
public class TourGalleryEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_TOUR_ID)
    private Long tourId;

    @NotNull
    @Column(name = COLUMN_FILE_CONTENT_ID)
    private Long fileContentId;

    @NotNull
    @Column(name = COLUMN_PREMIER)
    private Boolean premier;

    @NotNull
    @Column(name = COLUMN_LINE_NUMBER)
    private Integer lineNumber;

    @Column(name = COLUMN_DESCRIPTION)
    private String description;

}