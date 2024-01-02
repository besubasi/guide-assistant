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

    protected final JpaRepository<E, Long> jpaRepository;
    protected final BaseMapper<M, E> baseMapper;

    public GenericServiceImpl(JpaRepository<E, Long> jpaRepository, BaseMapper<M, E> baseMapper) {
        this.jpaRepository = jpaRepository;
        this.baseMapper = baseMapper;
    }

    @Override
    public M save(M model) {
        return this.baseMapper.convertToModel(this.jpaRepository.save(this.baseMapper.convertToEntity(model)));
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public M getById(Long id) {
        return this.baseMapper.convertToModel(jpaRepository.getReferenceById(id));
    }

    @Override
    public List<M> getList(SM searchModel) {
        LOGGER.info("SM : " + searchModel);
        return this.baseMapper.convertToModelList(jpaRepository.findAll());
    }

    // TODO getAll

    @Override
    public List<M> getPage(SM searchModel) {
        LOGGER.info("SM : " + searchModel);
        return Collections.emptyList();
    }

}
