package tr.com.subasi.guideassistant.common.mapper;

import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.entity.IdEntity;

import java.util.List;


public interface BaseMapper<M extends IdModel, E extends IdEntity> {

    List<M> convertToModelList(List<E> entityList);

    M convertToModel(E entity);

    List<E> convertToEntityList(List<M> modelList);

    E convertToEntity(M model);


}