package tr.com.subasi.guideassistant.app.tourcategory.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.tourcategory.entity.TourCategoryEntity;
import tr.com.subasi.guideassistant.app.tourcategory.model.TourCategorySearchModel;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class TourCategoryRepositoryImpl extends SimpleJpaRepository<TourCategoryEntity, Long> implements TourCategoryRepository {

    private final EntityManager entityManager;

    public TourCategoryRepositoryImpl(EntityManager entityManager) {
        super(TourCategoryEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(TourCategorySearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    private CriteriaQuery<Tuple> prepareQuery(TourCategorySearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<TourCategoryEntity> tourCategory = query.from(TourCategoryEntity.class);
        Join<TourCategoryEntity, CompanyEntity> company = tourCategory.join("company", JoinType.INNER);

        query.multiselect(
                tourCategory,
                company.get("code").alias("companyCode"),
                company.get("name").alias("companyName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, tourCategory, company);
        return query;
    }

    private void prepareWhereCriteria(TourCategorySearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<TourCategoryEntity> tourCategoryEntity, Join<TourCategoryEntity, CompanyEntity> companyEntity) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourCategoryEntity.get("id"), param))));
        ofNullable(searchModel.getCompanyId()).ifPresent(param -> predicates.add(builder.and(builder.equal(companyEntity.get("id"), param))));
        ofNullable(searchModel.getName()).ifPresent(param -> predicates.add(builder.and(builder.like(tourCategoryEntity.get("name"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourCategoryEntity.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }
}
