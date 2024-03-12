package tr.com.subasi.guideassistant.app.activity.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityModel extends IdModel {

    @NotNull
    private String code;
    @NotNull
    private String name;
    @NotNull
    private String estimatedTime;
    private boolean extra;
    private String contentUrl;
    private boolean active;

}
