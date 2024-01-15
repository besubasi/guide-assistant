package tr.com.subasi.guideassistant.common.service;

import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

@Validated
public interface BaseService<M extends IdModel, SM extends BaseSearchModel> {

    M save(@NotNull M model);

    void deleteById(@NotNull Long id);

    M getById(@NotNull Long id);

    List<M> getList(@NotNull SM searchModel);

    Page<M> getPage(@NotNull SM searchModel);

}
