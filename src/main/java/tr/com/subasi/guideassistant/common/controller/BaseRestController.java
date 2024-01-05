package tr.com.subasi.guideassistant.common.controller;

import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;
import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.service.BaseService;

import java.util.List;

public abstract class BaseRestController<S extends BaseService<M, SM>, M extends IdModel, SM extends BaseSearchModel> {

    protected S service;

    public BaseRestController(S service) {
        this.service = service;
    }

    public ApiResponse<M> save(M model) {
        return new ApiResponse<>(service.save(model));
    }

    public void deleteById(Long id) {
        service.deleteById(id);
    }

    public ApiResponse<M> getById(Long id) {
        return new ApiResponse<>(service.getById(id));
    }

    public ApiResponse<List<M>> getList(SM searchModel) {
        return new ApiResponse<>(service.getList(searchModel));
    }

    public ApiResponse<List<M>> getPage(SM searchModel) {
        return new ApiResponse<>(service.getPage(searchModel));
    }
}
