package tr.com.subasi.guideassistant.app.country.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.country.entity.CountryEntity;
import tr.com.subasi.guideassistant.app.country.model.CountrySearchModel;
import tr.com.subasi.guideassistant.common.model.Page;
import tr.com.subasi.guideassistant.common.model.Pageable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class CountryRepositoryImpl extends SimpleJpaRepository<CountryEntity, Long> implements CountryRepository {

    private final EntityManager entityManager;

    public CountryRepositoryImpl(EntityManager entityManager) {
        super(CountryEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<CountryEntity> getList(CountrySearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    @Override
    public Page<CountryEntity> getPage(CountrySearchModel searchModel) {
        long count = this.getCount(searchModel);
        if (count == 0)
            return new Page<>(Collections.emptyList(), searchModel.getPageable());

        Pageable pageable = searchModel.getPageable();
        List<CountryEntity> resultList = entityManager.createQuery(this.prepareQuery(searchModel))
                .setFirstResult(pageable.getPageNumber() * pageable.getPageSize())
                .setMaxResults(pageable.getPageSize())
                .getResultList();

        int totalPages = pageable.getPageSize() == 0 ? 1 : (int) Math.ceil((double) count / (double) pageable.getPageSize());
        return new Page<>(resultList, count, totalPages, pageable);
    }

    private CriteriaQuery<CountryEntity> prepareQuery(CountrySearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<CountryEntity> query = builder.createQuery(CountryEntity.class);

        Root<CountryEntity> countryEntity = query.from(CountryEntity.class);
        query.select(countryEntity);
        this.prepareWhereCriteria(searchModel, builder, query, countryEntity);
        return query;
    }

    private long getCount(CountrySearchModel searchModel) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);

        Root<CountryEntity> countryEntity = query.from(CountryEntity.class);
        query.select(builder.count(countryEntity));
        this.prepareWhereCriteria(searchModel, builder, query, countryEntity);
        return entityManager.createQuery(query).getSingleResult();
    }

    private void prepareWhereCriteria(CountrySearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query, Root<CountryEntity> countryEntity) {
        List<Predicate> predicates = new ArrayList<>();
        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(countryEntity.get("id"), param))));
        ofNullable(searchModel.getCode()).ifPresent(param -> predicates.add(builder.and(builder.equal(countryEntity.get("code"), param))));
        ofNullable(searchModel.getName()).ifPresent(param -> predicates.add(builder.and(builder.equal(countryEntity.get("name"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(countryEntity.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));
    }

}
