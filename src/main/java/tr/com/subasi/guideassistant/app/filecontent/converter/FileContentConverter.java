package tr.com.subasi.guideassistant.app.filecontent.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.filecontent.entity.FileContentEntity;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FileContentConverter extends BaseConverter<FileContentModel, FileContentEntity> {

}