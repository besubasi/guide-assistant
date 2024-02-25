package tr.com.subasi.guideassistant.app.tourdescription.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.tourdescription.converter.TourDescriptionConverter;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdescription.repository.TourDescriptionRepository;

@Service
public class TourDescriptionServiceImpl implements TourDescriptionService {

    private final TourDescriptionRepository repository;
    private final TourDescriptionConverter converter;

    public TourDescriptionServiceImpl(TourDescriptionRepository repository, TourDescriptionConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public TourDescriptionModel save(TourDescriptionModel model) {
        return this.converter.convertToModel(this.repository.save(this.converter.convertToEntity(model)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public TourDescriptionModel getByTourId(Long tourId) {
        return this.converter.convertToModel(repository.getByTourId(tourId));
    }

}
