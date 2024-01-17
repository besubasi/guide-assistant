package tr.com.subasi.guideassistant.app.filecontent.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseModel;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FileContentModel extends BaseModel {

    @NotNull
    private byte[] content;
    private byte[] smallContent;
    private String description;
    private String type;

}