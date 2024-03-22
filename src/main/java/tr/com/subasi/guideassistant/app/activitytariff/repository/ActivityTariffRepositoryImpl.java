package tr.com.subasi.guideassistant.app.activitytariff.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activitytariff.entity.ActivityTariffEntity;
import tr.com.subasi.guideassistant.app.activitytariff.model.ActivityTariffSearchModel;
import tr.com.subasi.guideassistant.app.currency.entity.CurrencyEntity;
import tr.com.subasi.guideassistant.app.pricingtype.entity.PricingTypeEntity;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class ActivityTariffRepositoryImpl extends SimpleJpaRepository<ActivityTariffEntity, Long> implements ActivityTariffRepository {

    private final EntityManager entityManager;

    public ActivityTariffRepositoryImpl(EntityManager entityManager) {
        super(ActivityTariffEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(ActivityTariffSearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    private CriteriaQuery<Tuple> prepareQuery(ActivityTariffSearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<ActivityTariffEntity> activityTariff = query.from(ActivityTariffEntity.class);
        Join<ActivityTariffEntity, PricingTypeEntity> pricingType = activityTariff.join("pricingType", JoinType.LEFT);
        Join<ActivityTariffEntity, CurrencyEntity> currency = activityTariff.join("currency", JoinType.LEFT);

        query.multiselect(
                activityTariff,
                pricingType.get("code").alias("pricingTypeCode"),
                pricingType.get("name").alias("pricingTypeName"),
                currency.get("code").alias("currencyCode"),
                currency.get("name").alias("currencyName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, activityTariff, pricingType, currency);
        return query;
    }

    private void prepareWhereCriteria(ActivityTariffSearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<ActivityTariffEntity> activityTariff, Join<ActivityTariffEntity, PricingTypeEntity> pricingType, Join<ActivityTariffEntity, CurrencyEntity> currency) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityTariff.get("id"), param))));
        ofNullable(searchModel.getActivityId()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityTariff.get("id"), param))));
        ofNullable(searchModel.getPricingTypeId()).ifPresent(param -> predicates.add(builder.and(builder.equal(pricingType.get("id"), param))));
        ofNullable(searchModel.getCurrencyId()).ifPresent(param -> predicates.add(builder.and(builder.equal(currency.get("id"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(activityTariff.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }
}
