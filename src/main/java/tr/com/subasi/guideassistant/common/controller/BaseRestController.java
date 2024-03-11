package tr.com.subasi.guideassistant.common.controller;

import tr.com.subasi.guideassistant.common.model.*;
import tr.com.subasi.guideassistant.common.service.BaseService;

import java.util.List;

public abstract class BaseRestController<S extends BaseService<M, SM>, M extends IdModel, SM extends BaseSearchModel> implements BaseRestService<M, SM> {

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

    public ApiResponse<List<LookupModel>> getLookupList(SM searchModel) {
        return new ApiResponse<>(service.getLookupList(searchModel));
    }

    public ApiResponse<List<M>> getList(SM searchModel) {
        return new ApiResponse<>(service.getList(searchModel));
    }

    public ApiResponse<Page<M>> getPage(SM searchModel) {
        return new ApiResponse<>(service.getPage(searchModel));
    }
}
