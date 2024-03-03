package tr.com.subasi.guideassistant.app.tourgallery.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryContentUpdateModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGallerySaveModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.util.List;

import static tr.com.subasi.guideassistant.common.constant.MappingConstant.*;

@Validated
public interface TourGalleryRestService {

    @PostMapping(value = MAPPING_CREATE_ALL, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<List<TourGalleryModel>> createAll(@Valid @RequestBody List<TourGallerySaveModel> modelList);

    @PostMapping(value = MAPPING_CREATE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourGalleryModel> create(@Valid @RequestBody TourGallerySaveModel model);

    @PostMapping(value = MAPPING_UPDATE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourGalleryModel> update(@Valid @RequestBody TourGalleryModel model);

    @PostMapping(value = MAPPING_UPDATE_CONTENT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourGalleryModel> updateContent(@Valid @RequestBody TourGalleryContentUpdateModel model);

    @DeleteMapping(MAPPING_DELETE_BY_ID)
    void deleteById(@NotNull @PathVariable("id") Long id);

    @GetMapping(value = MAPPING_GET_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<TourGalleryModel> getById(@NotNull @PathVariable("id") Long id);

    @GetMapping(value = MAPPING_GET_LIST_BY_TOUR_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<List<TourGalleryModel>> getListByTourId(@NotNull @PathVariable("tourId") Long tourId);

}
