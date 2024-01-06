package tr.com.subasi.guideassistant.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.subasi.guideassistant.common.entity.IdEntity;
import tr.com.subasi.guideassistant.common.mapper.BaseMapper;
import tr.com.subasi.guideassistant.common.model.IdModel;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

import java.util.Collections;
import java.util.List;

public abstract class BaseServiceImpl<M extends IdModel, SM extends BaseSearchModel, E extends IdEntity, R extends JpaRepository<E, Long>, C extends BaseMapper<M, E>> implements BaseService<M, SM> {

    protected static final Logger LOGGER = LoggerFactory.getLogger(BaseServiceImpl.class);

    protected final R repository;
    protected final C converter;

    public BaseServiceImpl(R repository, C converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public M save(M model) {
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

    // TODO getAll

    @Override
    public List<M> getPage(SM searchModel) {
        LOGGER.info("SM : " + searchModel);
        return Collections.emptyList();
    }

}