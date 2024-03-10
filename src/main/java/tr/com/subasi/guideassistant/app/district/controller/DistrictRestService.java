package tr.com.subasi.guideassistant.app.district.controller;

import org.springframework.validation.annotation.Validated;
import tr.com.subasi.guideassistant.app.district.model.DistrictModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSaveModel;
import tr.com.subasi.guideassistant.app.district.model.DistrictSearchModel;
import tr.com.subasi.guideassistant.common.controller.BaseRestService2;

@Validated
public interface DistrictRestService extends BaseRestService2<DistrictSaveModel, DistrictModel, DistrictSearchModel> {

}
