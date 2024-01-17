package tr.com.subasi.guideassistant.app.tourgallery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourGallerySearchModel extends BaseSearchModel {

    private Long tourId;
    private Long fileContentId;
    private Boolean premier;

}