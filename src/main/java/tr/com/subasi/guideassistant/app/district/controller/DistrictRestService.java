package tr.com.subasi.guideassistant.app.district.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.district.model.DistrictModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService;

@Validated
public interface DistrictRestService extends BaseRestService<DistrictModel, DistrictSearchModel> {

}
