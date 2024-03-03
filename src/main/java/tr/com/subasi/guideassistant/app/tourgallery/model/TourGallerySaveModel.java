package tr.com.subasi.guideassistant.app.tourgallery.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourGallerySaveModel {

    @NotNull
    private Long tourId;

    @NotNull
    private Integer lineNumber;

    @NotNull
    private String content;

    private String description;
}
