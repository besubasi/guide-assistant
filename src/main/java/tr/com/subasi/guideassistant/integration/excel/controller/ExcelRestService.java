package tr.com.subasi.guideassistant.integration.excel.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.integration.excel.model.TripCustomerExcelModel;

import java.util.List;

import static tr.com.subasi.guideassistant.integration.excel.constant.TripCustomerExcelConstant.MAPPING_UPLOAD_TRIP_CUSTOMER;

@Validated
public interface ExcelRestService {

    @PostMapping(value = MAPPING_UPLOAD_TRIP_CUSTOMER)
    ApiResponse<List<TripCustomerExcelModel>> uploadTripCustomer(@RequestParam("file") MultipartFile file);


}
