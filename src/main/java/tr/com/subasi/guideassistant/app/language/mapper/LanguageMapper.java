package tr.com.subasi.guideassistant.app.language.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.language.entity.LanguageEntity;
import tr.com.subasi.guideassistant.app.language.model.LanguageModel;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LanguageMapper extends BaseMapper<LanguageModel, LanguageEntity> {
}

