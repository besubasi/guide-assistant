package tr.com.subasi.guideassistant.app.tourgallery.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;

import java.io.IOException;
import java.util.List;

@Validated
public interface TourGalleryService {

    Boolean createContentList(@Valid @NotNull Long tourId, @NotEmpty MultipartFile[] files) throws IOException;

    TourGalleryModel updateContent(@Valid @NotNull Long id, @NotNull MultipartFile file) throws IOException;

    TourGalleryModel save(@Valid TourGalleryModel model);

    void deleteById(@Valid @NotNull Long id);

    TourGalleryModel getById(@Valid @NotNull Long id);

    List<TourGalleryModel> getListByTourId(@Valid @NotNull Long tourId);

}