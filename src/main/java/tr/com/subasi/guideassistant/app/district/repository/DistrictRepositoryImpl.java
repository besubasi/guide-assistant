package tr.com.subasi.guideassistant.app.district.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.district.entity.DistrictEntity;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class DistrictRepositoryImpl extends SimpleJpaRepository<DistrictEntity, Long> implements DistrictRepository {

    private final EntityManager entityManager;

    public DistrictRepositoryImpl(EntityManager entityManager) {
        super(DistrictEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(DistrictSearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    private CriteriaQuery<Tuple> prepareQuery(DistrictSearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<DistrictEntity> district = query.from(DistrictEntity.class);
        Join<DistrictEntity, CityEntity> city = district.join("city", JoinType.INNER);
        Join<DistrictEntity, CountryEntity> country = district.join("country", JoinType.INNER);

        query.multiselect(
                district,
                country.get("name").alias("countryName"),
                city.get("name").alias("cityName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, district, city, country);
        return query;
    }

    private void prepareWhereCriteria(DistrictSearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<DistrictEntity> district, Join<DistrictEntity, CityEntity> city, Join<DistrictEntity, CountryEntity> country) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(district.get("id"), param))));
        ofNullable(searchModel.getCountryId()).ifPresent(param -> predicates.add(builder.and(builder.equal(country.get("id"), param))));
        ofNullable(searchModel.getCityId()).ifPresent(param -> predicates.add(builder.and(builder.equal(city.get("id"), param))));
        ofNullable(searchModel.getName()).ifPresent(param -> predicates.add(builder.and(builder.like(district.get("name"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(district.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }
}

