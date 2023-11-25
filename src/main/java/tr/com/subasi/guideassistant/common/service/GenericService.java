package tr.com.subasi.guideassistant.common.service;

import tr.com.subasi.guideassistant.common.model.BaseModel;

import java.util.List;

public interface GenericService<M extends BaseModel, SM> {

    M save(M model);

    void deleteById(long id);

    M getById(long id);

    List<M> getList(SM searchModel);

    List<M> getPage(SM searchModel);

}
