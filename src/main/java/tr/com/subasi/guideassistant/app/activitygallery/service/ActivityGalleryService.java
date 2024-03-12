package tr.com.subasi.guideassistant.app.activitygallery.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGalleryModel;

import java.io.IOException;
import java.util.List;

@Validated
public interface ActivityGalleryService {

    Boolean createContentList(@Valid @NotNull Long activityId, @NotEmpty MultipartFile[] files) throws IOException;

    ActivityGalleryModel updateContent(@Valid @NotNull Long id, @NotNull MultipartFile file) throws IOException;

    ActivityGalleryModel save(@Valid ActivityGalleryModel model);

    void deleteById(@Valid @NotNull Long id);

    ActivityGalleryModel getById(@Valid @NotNull Long id);

    List<ActivityGalleryModel> getListByActivityId(@Valid @NotNull Long activityId);

}