package tr.com.subasi.guideassistant.app.filecontent.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentModel;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface FileContentRestService extends BaseRestService<FileContentModel, FileContentSearchModel> {
}
