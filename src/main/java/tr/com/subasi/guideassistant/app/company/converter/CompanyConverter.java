package tr.com.subasi.guideassistant.app.company.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.company.model.CompanyModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySaveModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;
import tr.com.subasi.guideassistant.common.converter.BaseConverter2;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyConverter extends BaseConverter2<CompanySaveModel, CompanyModel, CompanyEntity> {
}

