package tr.com.subasi.guideassistant.app.tour.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.app.tourcalendar.model.TourCalendarModel;
import tr.com.subasi.guideassistant.app.tourdaydescription.model.TourDayDescriptionModel;
import tr.com.subasi.guideassistant.app.tourdescription.model.TourDescriptionModel;
import tr.com.subasi.guideassistant.app.tourgallery.model.TourGalleryModel;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TourDetailModel extends TourModel {

    TourDescriptionModel tourDescriptionModel;
    private List<TourGalleryModel> tourGalleryModelList;
    private List<TourDayDescriptionModel> tourDayDescriptionModelList;
    private List<TourCalendarModel> tourCalendarModelList;

}
