package tr.com.subasi.guideassistant.app.language.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.language.entity.LanguageEntity;
import tr.com.subasi.guideassistant.app.language.model.LanguageModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LanguageConverter extends BaseConverter<LanguageModel, LanguageEntity> {
}

