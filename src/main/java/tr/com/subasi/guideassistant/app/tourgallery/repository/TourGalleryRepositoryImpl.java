package tr.com.subasi.guideassistant.app.tourgallery.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.tourgallery.entity.TourGalleryEntity;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGallerySearchModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.model.Pageable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class TourGalleryRepositoryImpl extends SimpleJpaRepository<TourGalleryEntity, Long> implements TourGalleryRepository {

    private final EntityManager entityManager;

    public TourGalleryRepositoryImpl(EntityManager entityManager) {
        super(TourGalleryEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<TourGalleryEntity> getList(TourGallerySearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    @Override
    public Page<TourGalleryEntity> getPage(TourGallerySearchModel searchModel) {
        long count = this.getCount(searchModel);
        if (count == 0)
            return new Page<>(Collections.emptyList(), searchModel.getPageable());

        Pageable pageable = searchModel.getPageable();
        List<TourGalleryEntity> resultList = entityManager.createQuery(this.prepareQuery(searchModel))
            .setFirstResult(pageable.getPageNumber() * pageable.getPageSize())
            .setMaxResults(pageable.getPageSize())
            .getResultList();

        int totalPages = pageable.getPageSize() == 0 ? 1 : (int) Math.ceil((double) count / (double) pageable.getPageSize());
        return new Page<>(resultList, count, totalPages, pageable);
    }

    private CriteriaQuery<TourGalleryEntity> prepareQuery(TourGallerySearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<TourGalleryEntity> query = builder.createQuery(TourGalleryEntity.class);

        Root<TourGalleryEntity> tourGalleryEntity = query.from(TourGalleryEntity.class);
        query.select(tourGalleryEntity);
        this.prepareWhereCriteria(searchModel, builder, query, tourGalleryEntity);
        return query;
    }

    private long getCount(TourGallerySearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);

        Root<TourGalleryEntity> tourGalleryEntity = query.from(TourGalleryEntity.class);
        query.select(builder.count(tourGalleryEntity));
        this.prepareWhereCriteria(searchModel, builder, query, tourGalleryEntity);
        return entityManager.createQuery(query).getSingleResult();
    }

    private void prepareWhereCriteria(TourGallerySearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<TourGalleryEntity> tourGalleryEntity) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getTourId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourGalleryEntity.get("tourId"), param))));
        ofNullable(searchModel.getFileContentId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourGalleryEntity.get("fileContentId"), param))));
        ofNullable(searchModel.getPremier()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourGalleryEntity.get("premier"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));
    }

}