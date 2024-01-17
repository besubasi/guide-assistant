package tr.com.subasi.guideassistant.app.activitygallery.model;

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
public class ActivityGalleryModel extends BaseModel {

    @NotNull
    private Long activityId;
    @NotNull
    private Long fileContentId;
    private String description;

}