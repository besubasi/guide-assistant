package tr.com.subasi.guideassistant.app.tourgallery.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourGalleryContentUpdateModel {

    @NotNull
    private Long id;

    @NotNull
    private String content;

}