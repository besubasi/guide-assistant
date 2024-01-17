package tr.com.subasi.guideassistant.app.filecontent.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.filecontent.converter.FileContentConverter;
import tr.com.subasi.guideassistant.app.filecontent.entity.FileContentEntity;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentModel;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentSearchModel;
import tr.com.subasi.guideassistant.app.filecontent.repository.FileContentRepositoryImpl;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class FileContentServiceImpl extends BaseServiceImpl<FileContentModel, FileContentSearchModel, FileContentEntity, FileContentRepositoryImpl, FileContentConverter> implements FileContentService {

    public FileContentServiceImpl(FileContentRepositoryImpl repository, FileContentConverter converter) {
        super(repository, converter);
    }
}