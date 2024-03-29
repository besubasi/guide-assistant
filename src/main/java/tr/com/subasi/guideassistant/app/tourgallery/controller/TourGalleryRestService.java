package tr.com.subasi.guideassistant.app.tourgallery.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;
import tr.com.subasi.guideassistant.common.model.ApiResponse;

import java.io.IOException;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static tr.com.subasi.guideassistant.common.constant.MappingConstant.*;

@Validated
public interface TourGalleryRestService {

    @PostMapping(value = MAPPING_CREATE_CONTENT_LIST)
    ApiResponse<Boolean> createContentList(@RequestParam("tourId") Long tourId, @RequestParam("file") MultipartFile[] files) throws IOException;

    @PostMapping(value = MAPPING_UPDATE_CONTENT)
    ApiResponse<TourGalleryModel> updateContent(@Valid @RequestParam("id") Long id, @RequestParam("file") MultipartFile file) throws IOException;

    @PostMapping(value = MAPPING_SAVE, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    ApiResponse<TourGalleryModel> save(@Valid @RequestBody TourGalleryModel model);

    @DeleteMapping(MAPPING_DELETE_BY_ID)
    void deleteById(@NotNull @PathVariable("id") Long id);

    @GetMapping(value = MAPPING_GET_BY_ID, produces = APPLICATION_JSON_VALUE)
    ApiResponse<TourGalleryModel> getById(@NotNull @PathVariable("id") Long id);

    @GetMapping(value = MAPPING_GET_LIST_BY_TOUR_ID, produces = APPLICATION_JSON_VALUE)
    ApiResponse<List<TourGalleryModel>> getListByTourId(@NotNull @PathVariable("tourId") Long tourId);

}
