package tr.com.subasi.guideassistant.app.touractivityrel.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.activity.entity.ActivityEntity;
import tr.com.subasi.guideassistant.app.activitygallery.entity.ActivityGalleryEntity;
import tr.com.subasi.guideassistant.app.tour.entity.TourEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.entity.TourActivityRelEntity;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityDetailRequest;
import tr.com.subasi.guideassistant.app.touractivityrel.model.TourActivityRelSearchModel;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Repository
public class TourActivityRelRepositoryImpl extends SimpleJpaRepository<TourActivityRelEntity, Long> implements TourActivityRelRepository {

    private final EntityManager entityManager;

    public TourActivityRelRepositoryImpl(EntityManager entityManager) {
        super(TourActivityRelEntity.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Tuple> getList(TourActivityRelSearchModel searchModel) {
        return entityManager.createQuery(this.prepareQuery(searchModel)).getResultList();
    }

    @Override
    public List<ActivityEntity> getActivityList(TourActivityDetailRequest request) {
        return entityManager.createQuery(this.prepareActivityListQuery(request)).getResultList();
    }

    @Override
    public List<ActivityGalleryEntity> getActivityGalleryList(TourActivityDetailRequest request) {
        return entityManager.createQuery(this.prepareActivityGalleryListQuery(request)).getResultList();
    }

    private CriteriaQuery<Tuple> prepareQuery(TourActivityRelSearchModel searchModel) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = criteriaBuilder.createTupleQuery();

        Root<TourActivityRelEntity> tourActivityRel = query.from(TourActivityRelEntity.class);
        Join<TourActivityRelEntity, TourEntity> tour = tourActivityRel.join("tour", JoinType.INNER);
        Join<TourActivityRelEntity, ActivityEntity> activity = tourActivityRel.join("activity", JoinType.INNER);

        query.multiselect(
                tourActivityRel,
                tour.get("code").alias("tourCode"),
                tour.get("name").alias("tourName"),
                activity.get("code").alias("activityCode"),
                activity.get("name").alias("activityName")
        );

        this.prepareWhereCriteria(searchModel, criteriaBuilder, query, tourActivityRel, tour, activity);
        return query;
    }

    private void prepareWhereCriteria(TourActivityRelSearchModel searchModel, CriteriaBuilder builder, CriteriaQuery<?> query,
                                      Root<TourActivityRelEntity> tourActivityRel, Join<TourActivityRelEntity, TourEntity> tour,
                                      Join<TourActivityRelEntity, ActivityEntity> activity) {
        List<Predicate> predicates = new ArrayList<>();

        ofNullable(searchModel.getId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourActivityRel.get("id"), param))));
        ofNullable(searchModel.getActivityId()).ifPresent(param -> predicates.add(builder.and(builder.equal(activity.get("activityId"), param))));
        ofNullable(searchModel.getTourId()).ifPresent(param -> predicates.add(builder.and(builder.equal(tour.get("id"), param))));
        ofNullable(searchModel.getActive()).ifPresent(param -> predicates.add(builder.and(builder.equal(tourActivityRel.get("active"), param))));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

    }

    private CriteriaQuery<ActivityEntity> prepareActivityListQuery(TourActivityDetailRequest request) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ActivityEntity> query = criteriaBuilder.createQuery(ActivityEntity.class);

        Root<TourActivityRelEntity> tourActivityRel = query.from(TourActivityRelEntity.class);
        Join<TourActivityRelEntity, ActivityEntity> activity = tourActivityRel.join("activity", JoinType.INNER);

        query.select(activity);

        List<Predicate> predicates = new ArrayList<>();

        ofNullable(request.getTourId()).ifPresent(param -> predicates.add(criteriaBuilder.and(criteriaBuilder.equal(tourActivityRel.get("tourId"), param))));
        ofNullable(request.getDayNumber()).ifPresent(param -> predicates.add(criteriaBuilder.and(criteriaBuilder.equal(activity.get("dayNumber"), param))));
        predicates.add(criteriaBuilder.and(criteriaBuilder.equal(tourActivityRel.get("active"), true)));
        predicates.add(criteriaBuilder.and(criteriaBuilder.equal(activity.get("active"), true)));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

        return query;
    }

    private CriteriaQuery<ActivityGalleryEntity> prepareActivityGalleryListQuery(TourActivityDetailRequest request) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ActivityGalleryEntity> query = criteriaBuilder.createQuery(ActivityGalleryEntity.class);

        Root<TourActivityRelEntity> tourActivityRel = query.from(TourActivityRelEntity.class);
        Join<TourActivityRelEntity, ActivityEntity> activity = tourActivityRel.join("activity", JoinType.INNER);
        Join<ActivityEntity, ActivityGalleryEntity> gallery = activity.join("activityGalleryList", JoinType.INNER);

        query.select(gallery);

        List<Predicate> predicates = new ArrayList<>();

        ofNullable(request.getTourId()).ifPresent(param -> predicates.add(criteriaBuilder.and(criteriaBuilder.equal(tourActivityRel.get("tourId"), param))));
        ofNullable(request.getDayNumber()).ifPresent(param -> predicates.add(criteriaBuilder.and(criteriaBuilder.equal(activity.get("dayNumber"), param))));
        predicates.add(criteriaBuilder.and(criteriaBuilder.equal(tourActivityRel.get("active"), true)));
        predicates.add(criteriaBuilder.and(criteriaBuilder.equal(activity.get("active"), true)));

        if (CollectionUtils.isNotEmpty(predicates))
            query.where(predicates.toArray(new Predicate[0]));

        return query;
    }


}
