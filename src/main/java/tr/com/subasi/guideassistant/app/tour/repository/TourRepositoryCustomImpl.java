package tr.com.subasi.guideassistant.app.tour.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.tour.model.TourSearchModel;
import tr.com.subasi.guideassistant.app.tourtype.entity.TourTypeEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TourRepositoryCustomImpl implements TourRepositoryCustom {

    private final EntityManager entityManager;

    public TourRepositoryCustomImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList2(TourSearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> criteriaQuery = criteriaBuilder.createTupleQuery();

        Root<TourEntity> tour = criteriaQuery.from(TourEntity.class);
        // Aşağıda Tour ile Company inner join yapılıyor. TourEntity de "company" isimli değişken olma şartını arar.
        // Yani ManyToOne yada OneToMany şeklinde iki entity arasında bağlantı olmasını bekler
        // Bu inner joini yapabilmek için TourEntity de @ManyToOne anotasyonu ile CompanyEntity arasında
        // ilişki olduğu belirtildi ve ilgili değişkenin adına "company" denildi
        Join<TourEntity, CompanyEntity> company = tour.join("company", JoinType.INNER);

        // Yine burada TourEntity de @ManyToOne anotasyonu ile TourTypeEntity arasında
        // ilişki olduğu belirtildi ve ilgili değişkenin adına "tourType" denildi

        Join<TourEntity, TourTypeEntity> tourType = tour.join("tourType", JoinType.INNER);

        criteriaQuery.multiselect(
                tour,
                company.get("code").alias("companyCode"),
                company.get("name").alias("companyName"),
                tourType.get("name").alias("tourTypeName")
        );

        List<Predicate> predicates = new ArrayList<>();
        Optional.ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(criteriaBuilder.equal(tour.get("id"), param)));
        Optional.ofNullable(searchModel.getCompanyId()).ifPresent(param -> predicates.add(criteriaBuilder.equal(company.get("id"), param)));
        Optional.ofNullable(searchModel.getCompanyId()).ifPresent(param -> predicates.add(criteriaBuilder.equal(tourType.get("id"), param)));
        Optional.ofNullable(searchModel.getCode()).ifPresent(param -> predicates.add(criteriaBuilder.equal(tour.get("code"), param)));
        Optional.ofNullable(searchModel.getName()).ifPresent(param -> predicates.add(criteriaBuilder.equal(tour.get("name"), param)));
        Optional.ofNullable(searchModel.getDay()).ifPresent(param -> predicates.add(criteriaBuilder.equal(tour.get("day"), param)));
        Optional.ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(criteriaBuilder.equal(tour.get("active"), param)));
        Optional.ofNullable(searchModel.getCompanyCode()).ifPresent(param -> predicates.add(criteriaBuilder.equal(company.get("code"), param)));
        Optional.ofNullable(searchModel.getTourTypeName()).ifPresent(param -> predicates.add(criteriaBuilder.equal(tourType.get("name"), param)));

        if (CollectionUtils.isNotEmpty(predicates))
            criteriaQuery.where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }

}
