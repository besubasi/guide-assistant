package tr.com.subasi.guideassistant.common.converter;

import org.mapstruct.IterableMapping;
import org.mapstruct.Named;
import tr.com.subasi.guideassistant.common.entity.IdEntity;
import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.model.LookupModel;

import java.util.List;

public interface BaseConverter<M extends IdModel, E extends IdEntity> {
    String convertToModelList = "convertToModelList";
    String convertToModel = "convertToModel";
    String convertToLookupModelList = "convertToLookupModelList";
    String convertToLookupModel = "convertToLookupModel";
    String convertToEntityList = "convertToEntityList";
    String convertToEntity = "convertToEntity";

    @Named(convertToModelList)
    @IterableMapping(qualifiedByName = convertToModel)
    List<M> convertToModelList(List<E> entityList);

    @Named(convertToModel)
    M convertToModel(E entity);

    @Named(convertToLookupModelList)
    @IterableMapping(qualifiedByName = convertToLookupModel)
    List<LookupModel> convertToLookupModelList(List<E> entityList);

    @Named(convertToLookupModel)
    LookupModel convertToLookupModel(E entity);

    @Named(convertToEntityList)
    @IterableMapping(qualifiedByName = convertToEntity)
    List<E> convertToEntityList(List<M> modelList);

    @Named(convertToEntity)
    E convertToEntity(M model);

}