package tr.com.subasi.guideassistant.app.account.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AccountSearchModel extends BaseSearchModel {

    private Long userId;
    private Long currencyId;

}



