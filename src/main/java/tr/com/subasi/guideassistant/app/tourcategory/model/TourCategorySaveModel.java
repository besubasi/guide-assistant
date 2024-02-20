package tr.com.subasi.guideassistant.app.tourcategory.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourCategorySaveModel {

    @NotNull
    private Long companyId;

    @NotBlank
    private String name;

    private Boolean active = Boolean.TRUE;
}