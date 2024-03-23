package tr.com.subasi.guideassistant.app.touractivityrel.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelModel;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSaveModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter2;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourActivityRelConverter extends BaseConverter2<TourActivityRelSaveModel, TourActivityRelModel, TourActivityRelEntity> {

}
