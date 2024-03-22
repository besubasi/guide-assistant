package tr.com.subasi.guideassistant.app.activitycompanyrel.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import jakarta.validation.constraints.NotNull;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitycompany.entity.ActivityCompanyEntity;
import tr.com.subasi.guideassistant.app.activitycompanyrel.entity.ActivityCompanyRelEntity;
import tr.com.subasi.guideassistant.app.activitycompanyrel.model.ActivityCompanyRelSearchModel;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class ActivityCompanyRelRepositoryImpl extends SimpleJpaRepository<ActivityCompanyRelEntity, Long> implements ActivityCompanyRelRepository {

    private final EntityManager entityManager;

    public ActivityCompanyRelRepositoryImpl(EntityManager entityManager) {
        super(ActivityCompanyRelEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(ActivityCompanyRelSearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    @Override
    public List<ActivityCompanyRelEntity> findByActivityId(@NotNull Long activityId) {
        return entityManager.createQuery(
                        "SELECT acr FROM ActivityCompanyRelEntity acr WHERE acr.activityId = :activityId", ActivityCompanyRelEntity.class)
                .setParameter("activityId", activityId)
                .getResultList();
    }
/*
    @Override
    public List<Object[]> findByActivityIdCustom(@NotNull Long activityId) {
        return entityManager.createQuery(
                        "SELECT acr, ac.name FROM ActivityCompanyRelEntity acr " +
                                "INNER JOIN ActivityCompanyEntity ac ON ac.id = acr.activityCompanyId " +
                                "WHERE acr.activityId = :activityId")
                .setParameter("activityId", activityId)
                .getResultList();
    }*/

    private CriteriaQuery<Tuple> prepareQuery(ActivityCompanyRelSearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<ActivityCompanyRelEntity> activityCompanyRel = query.from(ActivityCompanyRelEntity.class);
        Join<ActivityCompanyRelEntity, ActivityCompanyEntity> activityCompany = activityCompanyRel.join("activityCompany", JoinType.INNER);

        query.multiselect(
                activityCompanyRel,
                activityCompany.get("name").alias("activityCompanyName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, activityCompanyRel, activityCompany);
        return query;
    }

    private void prepareWhereCriteria(ActivityCompanyRelSearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<ActivityCompanyRelEntity> activityCompanyRel, Join<ActivityCompanyRelEntity, ActivityCompanyEntity> activityCompany) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityCompanyRel.get("id"), param))));
        ofNullable(searchModel.getActivityId()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityCompanyRel.get("activityId"), param))));
        ofNullable(searchModel.getActivityCompanyId()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityCompany.get("id"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityCompanyRel.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }
}
