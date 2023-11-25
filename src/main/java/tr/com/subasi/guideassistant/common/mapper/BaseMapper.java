package tr.com.subasi.guideassistant.common.mapper;

import tr.com.subasi.guideassistant.common.model.BaseModel;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;

import java.util.List;


public interface BaseMapper<M extends BaseModel, E extends BaseEntity> {

    List<M> convertToModelList(List<E> entityList);

    M convertToModel(E entity);

    List<E> convertToEntityList(List<M> modelList);

    E convertToEntity(M model);


}