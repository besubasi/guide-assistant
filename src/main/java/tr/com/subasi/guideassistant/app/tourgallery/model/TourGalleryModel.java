package tr.com.subasi.guideassistant.app.tourgallery.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourGalleryModel extends IdModel {

    @NotNull
    private Long tourId;
    @NotNull
    private String contentUrl;
    @NotNull
    private Integer lineNumber;
    private String description;

}