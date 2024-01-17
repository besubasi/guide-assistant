package tr.com.subasi.guideassistant.app.filecontent.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.filecontent.entity.FileContentEntity;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentSearchModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.model.Pageable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class FileContentRepositoryImpl extends SimpleJpaRepository<FileContentEntity, Long> implements FileContentRepository {

    private final EntityManager entityManager;

    public FileContentRepositoryImpl(EntityManager entityManager) {
        super(FileContentEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<FileContentEntity> getList(FileContentSearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    @Override
    public Page<FileContentEntity> getPage(FileContentSearchModel searchModel) {
        long count = this.getCount(searchModel);
        if (count == 0)
            return new Page<>(Collections.emptyList(), searchModel.getPageable());

        Pageable pageable = searchModel.getPageable();
        List<FileContentEntity> resultList = entityManager.createQuery(this.prepareQuery(searchModel))
            .setFirstResult(pageable.getPageNumber() * pageable.getPageSize())
            .setMaxResults(pageable.getPageSize())
            .getResultList();

        int totalPages = pageable.getPageSize() == 0 ? 1 : (int) Math.ceil((double) count / (double) pageable.getPageSize());
        return new Page<>(resultList, count, totalPages, pageable);
    }

    private CriteriaQuery<FileContentEntity> prepareQuery(FileContentSearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<FileContentEntity> query = builder.createQuery(FileContentEntity.class);

        Root<FileContentEntity> fileContentEntity = query.from(FileContentEntity.class);
        query.select(fileContentEntity);
        this.prepareWhereCriteria(searchModel, builder, query, fileContentEntity);
        return query;
    }

    private long getCount(FileContentSearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);

        Root<FileContentEntity> fileContentEntity = query.from(FileContentEntity.class);
        query.select(builder.count(fileContentEntity));
        this.prepareWhereCriteria(searchModel, builder, query, fileContentEntity);
        return entityManager.createQuery(query).getSingleResult();
    }

    private void prepareWhereCriteria(FileContentSearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<FileContentEntity> fileContentEntity) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getDescription()).ifPresent(param -> predicates.add(builder.and(builder.equal(fileContentEntity.get("description"), param))));
        ofNullable(searchModel.getType()).ifPresent(param -> predicates.add(builder.and(builder.equal(fileContentEntity.get("type"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));
    }

}