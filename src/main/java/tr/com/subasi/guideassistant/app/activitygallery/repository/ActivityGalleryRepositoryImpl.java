package tr.com.subasi.guideassistant.app.activitygallery.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;
import tr.com.subasi.guideassistant.app.activitygallery.model.ActivityGallerySearchModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.model.Pageable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class ActivityGalleryRepositoryImpl extends SimpleJpaRepository<ActivityGalleryEntity, Long> implements ActivityGalleryRepository {

    private final EntityManager entityManager;

    public ActivityGalleryRepositoryImpl(EntityManager entityManager) {
        super(ActivityGalleryEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<ActivityGalleryEntity> getList(ActivityGallerySearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    @Override
    public Page<ActivityGalleryEntity> getPage(ActivityGallerySearchModel searchModel) {
        long count = this.getCount(searchModel);
        if (count == 0)
            return new Page<>(Collections.emptyList(), searchModel.getPageable());

        Pageable pageable = searchModel.getPageable();
        List<ActivityGalleryEntity> resultList = entityManager.createQuery(this.prepareQuery(searchModel))
            .setFirstResult(pageable.getPageNumber() * pageable.getPageSize())
            .setMaxResults(pageable.getPageSize())
            .getResultList();

        int totalPages = pageable.getPageSize() == 0 ? 1 : (int) Math.ceil((double) count / (double) pageable.getPageSize());
        return new Page<>(resultList, count, totalPages, pageable);
    }

    private CriteriaQuery<ActivityGalleryEntity> prepareQuery(ActivityGallerySearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ActivityGalleryEntity> query = builder.createQuery(ActivityGalleryEntity.class);

        Root<ActivityGalleryEntity> activityGalleryEntity = query.from(ActivityGalleryEntity.class);
        query.select(activityGalleryEntity);
        this.prepareWhereCriteria(searchModel, builder, query, activityGalleryEntity);
        return query;
    }

    private long getCount(ActivityGallerySearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);

        Root<ActivityGalleryEntity> activityGalleryEntity = query.from(ActivityGalleryEntity.class);
        query.select(builder.count(activityGalleryEntity));
        this.prepareWhereCriteria(searchModel, builder, query, activityGalleryEntity);
        return entityManager.createQuery(query).getSingleResult();
    }

    private void prepareWhereCriteria(ActivityGallerySearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<ActivityGalleryEntity> activityGalleryEntity) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getActivityId()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityGalleryEntity.get("activityId"), param))));
        ofNullable(searchModel.getFileContentId()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityGalleryEntity.get("fileContentId"), param))));
        ofNullable(searchModel.getPremier()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityGalleryEntity.get("premier"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));
    }

}