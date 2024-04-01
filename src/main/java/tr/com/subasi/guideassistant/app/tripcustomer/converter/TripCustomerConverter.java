package tr.com.subasi.guideassistant.app.tripcustomer.converter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.guideassistant.app.tripcustomer.entity.TripCustomerEntity;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerModel;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerSaveModel;
import tr.com.subasi.guideassistant.common.converter.BaseConverter;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TripCustomerConverter extends BaseConverter<TripCustomerModel, TripCustomerEntity> {

    List<TripCustomerEntity> convertToEntityListBySaveModel(List<TripCustomerSaveModel> modelList);

}

