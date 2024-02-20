package tr.com.subasi.guideassistant.common.controller;

import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;
import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.service.BaseService;
import tr.com.subasi.guideassistant.common.service.BaseService2;

import java.util.List;

public abstract class BaseRestController2<S extends BaseService2<SVM, M, SM>, SVM, M extends IdModel, SM extends BaseSearchModel> implements BaseRestService2<SVM, M, SM> {

    protected S service;

    public BaseRestController2(S service) {
        this.service = service;
    }

    public ApiResponse<M> save(SVM model) {
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

    public ApiResponse<Page<M>> getPage(SM searchModel) {
        return new ApiResponse<>(service.getPage(searchModel));
    }
}
