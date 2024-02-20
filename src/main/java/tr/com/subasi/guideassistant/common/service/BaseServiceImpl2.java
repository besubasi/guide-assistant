package tr.com.subasi.guideassistant.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.subasi.guideassistant.common.converter.BaseConverter2;
import tr.com.subasi.guideassistant.common.entity.IdEntity;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;
import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.util.SortUtil;

import java.util.List;

public abstract class BaseServiceImpl2<SVM, M extends IdModel, SM extends BaseSearchModel, E extends IdEntity, R extends JpaRepository<E, Long>, C extends BaseConverter2<SVM, M, E>> implements BaseService2<SVM, M, SM> {

    protected static final Logger LOGGER = LoggerFactory.getLogger(BaseServiceImpl.class);

    protected final R repository;
    protected final C converter;

    public BaseServiceImpl2(R repository, C converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public M save(SVM model) {
        return this.converter.convertToModel(this.repository.save(this.converter.convertToEntity(model)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public M getById(Long id) {
        return this.converter.convertToModel(repository.getReferenceById(id));
    }

    @Override
    public List<M> getList(SM searchModel) {
        LOGGER.info("SM : " + searchModel);
        return this.converter.convertToModelList(repository.findAll());
    }

    @Override
    public Page<M> getPage(SM searchModel) {
        LOGGER.info("SM : " + searchModel);
        org.springframework.data.domain.Page<E> page = repository.findAll(SortUtil.convertToPageRequest(searchModel.getPageable()));
        return new Page<>(converter.convertToModelList(page.getContent()), page.getTotalElements(), page.getTotalPages(), searchModel.getPageable());
    }

}
