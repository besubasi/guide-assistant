package tr.com.subasi.guideassistant.app.city.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.city.model.CitySearchModel;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class CityRepositoryImpl extends SimpleJpaRepository<CityEntity, Long> implements CityRepository {

    private final EntityManager entityManager;

    public CityRepositoryImpl(EntityManager entityManager) {
        super(CityEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(CitySearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    private CriteriaQuery<Tuple> prepareQuery(CitySearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<CityEntity> city = query.from(CityEntity.class);
        Join<CityEntity, CountryEntity> country = city.join("country", JoinType.INNER);

        query.multiselect(
                city,
                country.get("code").alias("countryCode"),
                country.get("name").alias("countryName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, city, country);
        return query;
    }

    private void prepareWhereCriteria(CitySearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<CityEntity> city, Join<CityEntity, CountryEntity> country) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(city.get("id"), param))));
        ofNullable(searchModel.getCountryId()).ifPresent(param -> predicates.add(builder.and(builder.equal(country.get("id"), param))));
        ofNullable(searchModel.getName()).ifPresent(param -> predicates.add(builder.and(builder.like(city.get("name"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(city.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }
}
