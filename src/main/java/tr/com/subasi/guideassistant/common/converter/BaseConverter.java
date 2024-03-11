package tr.com.subasi.guideassistant.common.converter;

import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.entity.IdEntity;
import tr.com.subasi.guideassistant.common.model.LookupModel;

import java.util.List;


public interface BaseConverter<M extends IdModel, E extends IdEntity> {

    List<M> convertToModelList(List<E> entityList);

    M convertToModel(E entity);

    List<LookupModel> convertToLookupModelList(List<E> entityList);

    LookupModel convertToLookupModel(E entity);

    List<E> convertToEntityList(List<M> modelList);

    E convertToEntity(M model);


}