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

public abstract class GenericServiceImpl<M extends IdModel, SM extends BaseSearchModel, E extends IdEntity> implements GenericService<M, SM> {

    private static final Logger LOGGER = LoggerFactory.getLogger(GenericServiceImpl.class);

    protected final JpaRepository<E, Long> repository;
    protected final BaseMapper<M, E> mapper;

    public GenericServiceImpl(JpaRepository<E, Long> repository, BaseMapper<M, E> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public M save(M model) {
        return this.mapper.convertToModel(this.repository.save(this.mapper.convertToEntity(model)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public M getById(Long id) {
        return this.mapper.convertToModel(repository.getReferenceById(id));
    }

    @Override
    public List<M> getList(SM searchModel) {
        LOGGER.info("SM : " + searchModel);
        return this.mapper.convertToModelList(repository.findAll());
    }

    @Override
    public List<M> getPage(SM searchModel) {
        LOGGER.info("SM : " + searchModel);
        return Collections.emptyList();
    }

}
