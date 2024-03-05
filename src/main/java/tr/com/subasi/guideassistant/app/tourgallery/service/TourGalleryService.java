package tr.com.subasi.guideassistant.app.tourgallery.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryContentUpdateModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;

import java.io.IOException;
import java.util.List;

@Validated
public interface TourGalleryService {

    Boolean createFiles(@Valid @NotNull Long tourId, @NotEmpty MultipartFile[] files) throws IOException;

    TourGalleryModel update(@Valid TourGalleryModel model);

    TourGalleryModel updateContent(@Valid TourGalleryContentUpdateModel model);

    void deleteById(@NotNull Long id);

    TourGalleryModel getById(@NotNull Long id);

    List<TourGalleryModel> getListByTourId(@NotNull Long tourId);

}