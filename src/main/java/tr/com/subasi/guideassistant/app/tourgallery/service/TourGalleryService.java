package tr.com.subasi.guideassistant.app.tourgallery.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryContentUpdateModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGallerySaveModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;

import java.util.List;

@Validated
public interface TourGalleryService {

    List<TourGalleryModel> createAll(@Valid List<TourGallerySaveModel> modelList);

    TourGalleryModel create(@Valid TourGallerySaveModel model);

    TourGalleryModel update(@Valid TourGalleryModel model);

    TourGalleryModel updateContent(@Valid TourGalleryContentUpdateModel model);

    void deleteById(@NotNull Long id);

    TourGalleryModel getById(@NotNull Long id);

    List<TourGalleryModel> getListByTourId(@NotNull Long tourId);

}