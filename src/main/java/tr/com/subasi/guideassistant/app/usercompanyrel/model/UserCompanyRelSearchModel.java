package tr.com.subasi.guideassistant.app.usercompanyrel.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserCompanyRelSearchModel extends BaseSearchModel {

    private Long userId, companyId;
    private Boolean active;

}
