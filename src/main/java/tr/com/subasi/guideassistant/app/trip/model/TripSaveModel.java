package tr.com.subasi.guideassistant.app.trip.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import tr.com.subasi.guideassistant.app.tripcustomer.model.TripCustomerSaveModel;

import java.time.LocalDate;
import java.util.List;

@Data
public class TripSaveModel {

    @NotNull
    private String code;

    @NotNull
    private Long tourId;

    @NotNull
    private Long firstGuideUserId;
    private Long secondGuideUserId;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private Integer day;

    @NotEmpty
    private List<TripCustomerSaveModel> customerList;
}
