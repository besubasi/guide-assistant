package tr.com.subasi.guideassistant.app.tourtype.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;
import tr.com.subasi.guideassistant.app.tourtype.model.TourTypeSearchModel;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class TourTypeRepositoryImpl extends SimpleJpaRepository<TourTypeEntity, Long> implements TourTypeRepository {

    private final EntityManager entityManager;

    public TourTypeRepositoryImpl(EntityManager entityManager) {
        super(TourTypeEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(TourTypeSearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    private CriteriaQuery<Tuple> prepareQuery(TourTypeSearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<TourTypeEntity> tourType = query.from(TourTypeEntity.class);
        Join<TourTypeEntity, TourCategoryEntity> tourCategory = tourType.join("tourCategory", JoinType.INNER);
        Join<TourTypeEntity, CompanyEntity> company = tourType.join("company", JoinType.INNER);

        query.multiselect(
                tourType,
                company.get("code").alias("companyCode"),
                company.get("name").alias("companyName"),
                tourCategory.get("name").alias("tourCategoryName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, tourType, tourCategory, company);
        return query;
    }

    private void prepareWhereCriteria(TourTypeSearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<TourTypeEntity> tourType, Join<TourTypeEntity, TourCategoryEntity> tourCategory, Join<TourTypeEntity, CompanyEntity> company) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourType.get("id"), param))));
        ofNullable(searchModel.getCompanyId()).ifPresent(param -> predicates.add(builder.and(builder.equal(company.get("id"), param))));
        ofNullable(searchModel.getTourCategoryId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourCategory.get("id"), param))));
        ofNullable(searchModel.getName()).ifPresent(param -> predicates.add(builder.and(builder.like(tourType.get("name"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourType.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }
}
