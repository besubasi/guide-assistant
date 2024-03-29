package tr.com.subasi.guideassistant.app.activitygallery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityGallerySearchModel extends BaseSearchModel {

    private Long activityId;
    private Long fileContentId;
    private Boolean premier;

}