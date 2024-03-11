package tr.com.subasi.guideassistant.app.company.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.city.entity.CityEntity;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;
import tr.com.subasi.guideassistant.app.district.entity.DistrictEntity;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class CompanyRepositoryImpl extends SimpleJpaRepository<CompanyEntity, Long> implements CompanyRepository {

    private final EntityManager entityManager;

    public CompanyRepositoryImpl(EntityManager entityManager) {
        super(CompanyEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(CompanySearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    private CriteriaQuery<Tuple> prepareQuery(CompanySearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<CompanyEntity> company = query.from(CompanyEntity.class);
        Join<CompanyEntity, CountryEntity> country = company.join("country", JoinType.INNER);
        Join<CompanyEntity, CityEntity> city = company.join("city", JoinType.INNER);
        Join<CompanyEntity, DistrictEntity> district = company.join("district", JoinType.LEFT);

        query.multiselect(
                company,
                country.get("name").alias("countryName"),
                city.get("name").alias("cityName"),
                district.get("name").alias("districtName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, company, city, country, district);
        return query;
    }

    private void prepareWhereCriteria(CompanySearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<CompanyEntity> company, Join<CompanyEntity, CityEntity> city, Join<CompanyEntity, CountryEntity> country, Join<CompanyEntity, DistrictEntity> district) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(company.get("id"), param))));
        ofNullable(searchModel.getCountryId()).ifPresent(param -> predicates.add(builder.and(builder.equal(country.get("id"), param))));
        ofNullable(searchModel.getCityId()).ifPresent(param -> predicates.add(builder.and(builder.equal(city.get("id"), param))));
        ofNullable(searchModel.getDistrictId()).ifPresent(param -> predicates.add(builder.and(builder.equal(district.get("id"), param))));
        ofNullable(searchModel.getName()).ifPresent(param -> predicates.add(builder.and(builder.like(company.get("name"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(company.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }
}

