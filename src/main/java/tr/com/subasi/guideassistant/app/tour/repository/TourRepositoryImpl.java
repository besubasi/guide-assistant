package tr.com.subasi.guideassistant.app.tour.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.model.Pageable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class TourRepositoryImpl extends SimpleJpaRepository<TourEntity, Long> implements TourRepository {

    private final EntityManager entityManager;

    public TourRepositoryImpl(EntityManager entityManager) {
        super(TourEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(TourSearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    @Override
    public Page<Tuple> getPage(TourSearchModel searchModel) {
        long count = this.getCount(searchModel);
        if (count == 0)
            return new Page<>(Collections.emptyList(), searchModel.getPageable());

        Pageable pageable = searchModel.getPageable();
        List<Tuple> resultList = entityManager.createQuery(this.prepareQuery(searchModel))
                .setFirstResult(pageable.getPageNumber() * pageable.getPageSize())
                .setMaxResults(pageable.getPageSize())
                .getResultList();

        int totalPages = pageable.getPageSize() == 0 ? 1 : (int) Math.ceil((double) count / (double) pageable.getPageSize());
        return new Page<>(resultList, count, totalPages, pageable);
    }

    @Override
    public Tuple getDetail(Long id) {
        return null;
    }

    private CriteriaQuery<Tuple> prepareQuery(TourSearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<TourEntity> tour = query.from(TourEntity.class);
        Join<TourEntity, CompanyEntity> company = tour.join("company", JoinType.INNER);
        Join<TourEntity, TourTypeEntity> tourType = tour.join("tourType", JoinType.INNER);
        Join<TourTypeEntity, TourCategoryEntity> tourCategory = tourType.join("tourCategory", JoinType.INNER);

        query.multiselect(
                tour,
                company.get("code").alias("companyCode"),
                company.get("name").alias("companyName"),
                tourType.get("name").alias("tourTypeName"),
                tourCategory.get("name").alias("tourCategoryName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, tour, company, tourType);
        return query;
    }

    private long getCount(TourSearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);

        Root<TourEntity> tour = query.from(TourEntity.class);
        Join<TourEntity, CompanyEntity> company = tour.join("company", JoinType.INNER);
        Join<TourEntity, TourTypeEntity> tourType = tour.join("tourType", JoinType.INNER);

        query.select(builder.count(tour));

        this.prepareWhereCriteria(searchModel, builder, query, tour, company, tourType);
        return entityManager.createQuery(query).getSingleResult();
    }

    private void prepareWhereCriteria(TourSearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<TourEntity> tourEntity, Join<TourEntity, CompanyEntity> companyEntity, Join<TourEntity, TourTypeEntity> tourTypeEntity) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourEntity.get("id"), param))));
        ofNullable(searchModel.getCompanyId()).ifPresent(param -> predicates.add(builder.and(builder.equal(companyEntity.get("id"), param))));
        ofNullable(searchModel.getTourTypeId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourTypeEntity.get("id"), param))));
        ofNullable(searchModel.getCode()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourEntity.get("code"), param))));
        ofNullable(searchModel.getName()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourEntity.get("name"), param))));
        ofNullable(searchModel.getDay()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourEntity.get("day"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourEntity.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }
}
