package tr.com.subasi.guideassistant.app.tourgallery.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseModel;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourGalleryModel extends BaseModel {

    @NotNull
    private Long tourId;
    @NotNull
    private Long fileContentId;
    @NotNull
    private Boolean premier;
    @NotNull
    private Integer lineNumber;
    private String description;

}