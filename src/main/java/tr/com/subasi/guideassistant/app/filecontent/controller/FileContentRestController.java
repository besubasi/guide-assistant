package tr.com.subasi.guideassistant.app.filecontent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentModel;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentSearchModel;
import tr.com.subasi.guideassistant.app.filecontent.service.FileContentService;
import tr.com.subasi.guideassistant.common.controller.BaseRestController;

import static tr.com.subasi.guideassistant.app.filecontent.constant.FileContentConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class FileContentRestController extends BaseRestController<FileContentService, FileContentModel, FileContentSearchModel> implements FileContentRestService{

    public FileContentRestController(FileContentService service) {
        super(service);
    }
}