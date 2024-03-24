package tr.com.subasi.guideassistant.integration.excel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.common.enums.EnumMessageType;
import tr.com.subasi.guideassistant.common.model.ApiResponse;
import tr.com.subasi.guideassistant.common.model.MessageModel;
import tr.com.subasi.guideassistant.integration.excel.model.TripCustomerExcelModel;
import tr.com.subasi.guideassistant.integration.excel.service.ExcelService;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static tr.com.subasi.guideassistant.integration.excel.constant.TripCustomerExcelConstant.MAPPING_UPLOAD_TRIP_CUSTOMER;
import static tr.com.subasi.guideassistant.integration.excel.constant.TripCustomerExcelConstant.REQUEST_MAPPING;


@RestController
@RequestMapping(REQUEST_MAPPING)
public class ExcelController implements ExcelRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelRestService.class);

    private final ExcelService excelService;

    @Autowired
    public ExcelController(ExcelService excelService) {
        this.excelService = excelService;
    }

    @PostMapping(MAPPING_UPLOAD_TRIP_CUSTOMER)
    public ApiResponse<List<TripCustomerExcelModel>> uploadTripCustomer(@RequestParam("file") MultipartFile file) {
        try {
            return new ApiResponse<>(excelService.uploadTripCustomer(file));
        } catch (IOException e) {
            LOGGER.error("", e);
            return new ApiResponse<>(Collections.singletonList(new MessageModel(EnumMessageType.ERROR, "Excel okuma sırasında hata oluştu")));
        }
    }
}
