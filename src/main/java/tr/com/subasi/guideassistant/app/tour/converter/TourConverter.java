package tr.com.subasi.guideassistant.app.tour.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.model.TourModel;
import tr.com.subasi.guideassistant.app.tour.model.TourSaveModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter2;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TourConverter extends BaseConverter2<TourSaveModel, TourModel, TourEntity> {


}

