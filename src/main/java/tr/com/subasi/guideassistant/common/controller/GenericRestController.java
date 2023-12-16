package tr.com.subasi.guideassistant.common.controller;

import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;
import tr.com.subasi.guideassistant.common.service.GenericService;

import java.util.List;

public abstract class GenericRestController<M extends IdModel, SM extends BaseSearchModel> implements GenericRestService<M, SM> {

    protected GenericService<M, SM> service;

    public GenericRestController(GenericService<M, SM> service) {
        this.service = service;
    }

    @Override
    public ApiResponse<M> save(M model) {
        return new ApiResponse<>(service.save(model));
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    public ApiResponse<M> getById(Long id) {
        return new ApiResponse<>(service.getById(id));
    }

    @Override
    public ApiResponse<List<M>> getList(SM searchModel) {
        return new ApiResponse<>(service.getList(searchModel));
    }

    @Override
    public ApiResponse<List<M>> getPage(SM searchModel) {
        return new ApiResponse<>(service.getPage(searchModel));
    }
}
